import java.io.IOError;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.nio.charset.Charset;

/**
 * Created by wwh on 15-7-24.
 */
public class JavaNioSocket {
    private Selector selector = null;
    static final int PORT = 30000;
    //定义实现编码，解析字符串的对象
    private Charset charset = Charset.forName("UTF-8");
    public void init() throws IOException{
        selector = Selector.open();
        //通过open方法来打开一个未绑定的serversocketchannel实例
        ServerSocketChannel server = ServerSocketChannel.open();
        InetSocketAddress isa = new InetSocketAddress("192.168.10.75", PORT);
        //将该ServerSocketChannel绑定指定IP地址
        server.bind(isa);
        //设置非阻塞
        server.configureBlocking(false);
        //将server事件注册到Selector对象上
        server.register(selector, SelectionKey.OP_ACCEPT);
        while(selector.select() > 0){
            //依次处理返回的就绪事件的集合
            for(SelectionKey sk :  selector.selectedKeys()){
                //删除正在注册的对象
                selector.selectedKeys().remove(sk);
                //如果是连接请求
                if(sk.isAcceptable()){
                    //调用accept接受连接，产生服务器的socketchannel
                    SocketChannel sc = server.accept();
                    //设置非阻塞
                    sc.configureBlocking(false);
                    //将接受到的连接注册到selector上
                    sc.register(selector, SelectionKey.OP_READ);
                    //将sk对应的channel设置成准备接受其他请求
                    sk.interestOps(SelectionKey.OP_ACCEPT);
                }
                if(sk.isReadable()){
                    //获取对应的channel，上面有我们需要的数据
                    SocketChannel sc = (SocketChannel)sk.channel();
                    //定义准备执行读取的buffer
                    ByteBuffer buff = ByteBuffer.allocate(1024);
                    String content = "";
                    //开始读取数据
                    try{
                        while (sc.read(buff) > 0){
                            //从buffer的写转换为读
                            buff.flip();
                            content += charset.decode(buff);
                        }
                        //打印接受到的数据
                        System.out.println("收到：" + content);
                        //将sk对应的channel设置称准备读取下一数据u
                        sk.interestOps(SelectionKey.OP_READ);
                    }catch (IOException ex){
                        //如果sk对应的channel出现了问题，说明客户端的channel出现了异常，我们取消它的注册
                        //从selector中删除指定的SelectionKey
                        sk.cancel();
                        if(sk.channel() != null){
                            sk.channel().close();
                        }
                    }
                    if(content.length() > 0){
                        //遍历该selector里注册的所有selectionKey
                        for(SelectionKey key : selector.keys()){
                            //获得key对应的channel
                            Channel targetChannel = key.channel();
                            //如果该对象是SocketChannel对象
                            if(targetChannel instanceof SocketChannel){
                                //将读到的内容写到该channel中
                                SocketChannel dest = (SocketChannel)targetChannel;
                                dest.write(charset.encode(content));
                            }
                        }
                    }
                }
            }
        }
    }
    public static void main(String[] args) throws IOException{
        new JavaNioSocket().init();
    }
}
