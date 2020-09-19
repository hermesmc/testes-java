package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
// --> Exemplo gravação de arquivo
		String nome = "Hermes Maruyama";				
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));		
		oos.writeObject(nome);
		oos.close();
		
		
// --> Exemplo leitura arquivo
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
		String nomeLido = (String) ois.readObject();		
		ois.close();
		System.out.println(nomeLido);
		
	}

}
