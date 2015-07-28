import com.sun.deploy.security.EnhancedJarVerifier;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;

import java.nio.channels.ServerSocketChannel;
import java.nio.charset.Charset;


/**
 * Created by wwh on 15-7-25.
 */
public class EchoServer {
    private final int port;
    public EchoServer(int port) {
        this.port = port;
    }

    public void run() throws Exception{
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        try {
            ServerBootstrap b = new ServerBootstrap();

            b.group(bossGroup, workerGroup)
                    .channel(NioServerSocketChannel.class)
                    .option(ChannelOption.SO_BACKLOG, 100)
                    .handler(new LoggingHandler(LogLevel.INFO))
                    .childHandler(new ChannelInitializer<SocketChannel>() {
                        public void initChannel(SocketChannel ch) throws Exception {
                            //abstractBoostStrap中的Handler是个工厂类，它为每个新接入的客户端都创建一个新的Handler
                            //下面代码每新连接一个socket,都会创建一个EchoServerHandler
                            System.out.println("hello");
                            //注意channelpipeline = channel.pipeline
                            ch.pipeline().addLast(new EchoServerHandler());
                            ch.pipeline().addLast(new StringDecoder());
                            ch.pipeline().addLast(new StringEncoder());
                            //ch.pipeline().addLast(new LoggingHandler(LogLevel.INFO));
                        }
                    });
            ChannelFuture f = b.bind(port).sync();
            System.out.println("bind....");
            f.channel().closeFuture().sync();
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            bossGroup.shutdownGracefully();
            workerGroup.shutdownGracefully();
        }
    }


    public static void main(String[] args) throws Exception {
        int port;
        if(args.length > 0){
            port = Integer.parseInt(args[0]);
        }else{
            port = 10000;
        }
        new EchoServer(port).run();
    }
}
