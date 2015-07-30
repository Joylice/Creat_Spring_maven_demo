package demo.test;

import java.nio.IntBuffer;

public class IntBufferDemo1 {
	public static void main(String[] args) {

		IntBuffer buf = IntBuffer.allocate(10);
		System.out.print("1.写入数据之前的position、limit和capa：");
		System.out.println("position=" + buf.position() + ",limit="
				+ buf.limit() + ", capacity=" + buf.capacity());

		int temp[] = { 5, 7, 9 };
		buf.put(3);
		buf.put(temp);
		System.out.print("2.写入数据之后的position。limit和capacity：");
		System.out.println("position=" + buf.position() + ",limit="
				+ buf.limit() + ", capacity=" + buf.capacity());
          buf.flip();
          System.out.print("3.准备输出数据时的position。limit和capacity：");
          System.out.println("position=" + buf.position() + ",limit="
        		  + buf.limit() + ", capacity=" + buf.capacity());
          System.out.println("缓冲区中的内容：");
          while(buf.hasRemaining()){
        	  int x=buf.get();
        	  System.out.println(x+"、");
          }
	}
}
