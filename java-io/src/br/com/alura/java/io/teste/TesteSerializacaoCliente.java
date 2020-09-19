package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacaoCliente {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
	
//		Cliente cliente = new Cliente();
//		cliente.setNome("Hermes Maruyama");
//		cliente.setProfissao("Analista de Sistemas");
//		cliente.setCpf("64784070125");	
		
// --> Exemplo gravação de arquivo
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));		
//		oos.writeObject(cliente);
//		oos.close();
		
		
// --> Exemplo leitura arquivo
//		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente cliente = (Cliente) ois.readObject();		
		ois.close();
		System.out.println(cliente.getNome());
		
	}

}
