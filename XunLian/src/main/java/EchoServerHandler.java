import com.sun.xml.internal.ws.api.message.Packet;
import io.netty.buffer.ByteBuf;
import io.netty.channel.*;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.util.ReferenceCountUtil;
import org.json.JSONObject;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.util.Base64;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by wwh on 15-7-25.
 */
public class EchoServerHandler extends ChannelInboundHandlerAdapter {
    private static final Logger logger = Logger.getLogger(
            EchoServerHandler.class.getName()
    );
    EchoServerHandler(){
        System.out.println("EchoServerHandler被创建");
    }

    public void channelRead(ChannelHandlerContext ctx, Object msg)throws Exception{
        ByteBuf result = (ByteBuf)msg;
        ctx.write(msg);
        //System.out.println(((ByteBuf) msg));
        //result.release();
        //JSONObject js = new JSONObject((String)msg);
        //int mark = js.getInt("mark");
        //String phonenumber = js.getString("phonenumber");
        //System.out.println("mark:" + mark + "  phonenumber:" + phonenumber);
    }

    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception{
        ctx.flush();
    }

    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause){
        logger.log(Level.WARNING, "unexcepted exception from downstream", cause);
       ctx.close();
}
}