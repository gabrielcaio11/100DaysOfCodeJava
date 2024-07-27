package com.gcaio.application;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class LendoArquivosComBuffersMenores {

	public static void main(String[] args) throws IOException {
		Path path = Path.of("C:\\temp\\docs\\LoremIpsum.txt");
		ByteBuffer buffer = ByteBuffer.allocate(100);
		try (ByteChannel channel = Files.newByteChannel(path, StandardOpenOption.READ)) {
			while (channel.read(buffer) > 0) {
				buffer.flip();
				// System.out.println(buffer.position());
				Charset charSet = StandardCharsets.UTF_8;
				CharBuffer charBuffer = charSet.decode(buffer);
				buffer.clear();
				// System.out.println(buffer.position());
				System.out.print(charBuffer);
			}
		}

	}

}
