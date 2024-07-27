package com.gcaio.application;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class ByteBufferParaCharBuffer {

	public static void main(String[] args) {
		ByteBuffer buffer = ByteBuffer.allocate(1024);

		buffer.put((byte) 79);
		buffer.put((byte) 108);
		buffer.put((byte) -61);
		buffer.put((byte) -95);

		buffer.flip();

		//CharBuffer charBuffer = buffer.asCharBuffer();
		
		Charset charSet = StandardCharsets.UTF_8;
		CharBuffer charBuffer = charSet.decode(buffer);
		System.out.println(charBuffer);
	}

}
