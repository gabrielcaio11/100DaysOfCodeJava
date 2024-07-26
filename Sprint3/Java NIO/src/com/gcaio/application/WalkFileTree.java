package com.gcaio.application;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class WalkFileTree {

	public static void main(String[] args) throws IOException {
		Path pasta = Path.of("C:\\temp\\docs");
		// Files.delete(pasta);
		Files.walkFileTree(pasta, new SimpleFileVisitor<>() {
			@Override
			public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
				
				System.out.printf("excluindo o arquivo %s%n",file);
				Files.delete(file);
				return FileVisitResult.CONTINUE;
				
			};
			/*public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
				
				System.out.printf("excluindo o diretorio %s%n",dir);
				return FileVisitResult.CONTINUE;
			};*/
			@Override
			public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
				System.out.printf("excluindo o diretorio %s%n",dir);
				Files.delete(dir);
				return FileVisitResult.CONTINUE;
			};
		});
	}

}
