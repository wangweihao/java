package JavaNio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by wwh on 15-7-24.
 */
public class JavaFileChannel {
    public static void main(String[] args) throws IOException {
        RandomAccessFile aFile = new RandomAccessFile("/home/wwh/1.txt", "rw");

        FileChannel inChannel = aFile.getChannel();

        ByteBuffer buf = ByteBuffer.allocate(40);
        int byteReaed = inChannel.read(buf);
        while(byteReaed != -1)
        {
            System.out.println("read" + byteReaed);
            buf.flip();

            while(buf.hasRemaining()){
                System.out.print((char)buf.get());
            }
            buf.clear();
            byteReaed = inChannel.read(buf);
        }
    }
}
