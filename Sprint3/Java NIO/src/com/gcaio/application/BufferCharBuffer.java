package com.gcaio.application;

import java.nio.CharBuffer;

public class BufferCharBuffer {

	public static void main(String[] args) {
		CharBuffer buffer = CharBuffer.allocate(1000);
		
		buffer.put('g');		
		buffer.put('a');		
		buffer.put('b');		
		buffer.put('r');		
		buffer.put('i');		
		buffer.put('e');		
		buffer.put('l');
		
		buffer.flip(); 		
		
		System.out.println(buffer);
		
		buffer.put('f');		
		buffer.put('l');
		buffer.put('a');
		
		buffer.flip(); 		
		System.out.println(buffer);
		

	}

}
