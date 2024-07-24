package com.gcaio.application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Path;

import com.gcaio.entities.Produto;

public class Main {

	public static void main(String[] args) {
		Produto produto = new Produto("Notebook", 10);
		
		//caminho relativo do arquivo
		Path path =  Path.of("objetosSerializable\\Produtos");
		// usando a api classica de I/O para serializar
		try(var outputStream = new ObjectOutputStream(new FileOutputStream(path.toFile()))){
			outputStream.writeObject(produto);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//desserializando
		
		try(var inputStream = new ObjectInputStream(new FileInputStream(path.toFile()))){
			Produto produtoDesserializado = (Produto) inputStream.readObject();
			System.out.println(produtoDesserializado);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}	
		
	}
	
}
