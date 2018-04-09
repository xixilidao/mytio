import java.nio.ByteBuffer;

public class main {
    public static void main(String[] args){
        System.out.println("hello,world");
        ByteBuffer byteBuffer = ByteBuffer.allocate(7);
        byteBuffer.put((byte)5);
        byteBuffer.put((byte)7);
        System.out.println(byteBuffer);
        System.out.println(byteBuffer.get(0));
        
    }
}
