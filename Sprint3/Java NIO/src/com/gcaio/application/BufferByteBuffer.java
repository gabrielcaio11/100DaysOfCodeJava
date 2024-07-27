package com.gcaio.application;

import java.nio.ByteBuffer;
import java.util.Arrays;

public class BufferByteBuffer {

	public static void main(String[] args) {
		ByteBuffer buffer = ByteBuffer.allocate(1024);// 1kb
		System.out.println("Limite: " + buffer.limit());
		
		System.out.println(Arrays.toString(buffer.array()));
		
		System.out.println(buffer.position());
		
		buffer.put((byte) 10);		
		System.out.println(buffer.position());
		
		buffer.put((byte) 127);
		System.out.println(buffer.position());
		
		System.out.println(Arrays.toString(buffer.array()));
		
		//buffer.flip(); 
		buffer.clear();
		System.out.println("Limite: " + buffer.limit());
		System.out.println(buffer.position());
		System.out.println(Arrays.toString(buffer.array()));
		
		buffer.put((byte) 30);		
		System.out.println(buffer.position());
		
		buffer.put((byte) 27);
		System.out.println(buffer.position());
		System.out.println(Arrays.toString(buffer.array()));
		
		buffer.put((byte) 57); //da erro pq o limite agora é dois e alem disso 
		System.out.println(buffer.position());
		System.out.println(Arrays.toString(buffer.array()));
	}

}
