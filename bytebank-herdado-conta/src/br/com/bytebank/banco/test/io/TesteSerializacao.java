package br.com.bytebank.banco.test.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteSerializacao {

	public static void main(String[] args) throws FileNotFoundException, IOException {
 
		Cliente cliente = new Cliente();
		cliente.setNome("Hermes Maruyama");
		cliente.setProfissao("Analista de Sistemas");
		cliente.setCpf("64784070125");	
		
		ContaCorrente cc = new ContaCorrente(2234, 544412);
		cc.setTitular(cliente);
		cc.deposita(252.88);		
		
// --> Exemplo gravação de arquivo
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));		
		oos.writeObject(cc);
		oos.close();
		
		
// --> Exemplo leitura arquivo
//		
//		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
//		Cliente cliente = (Cliente) ois.readObject();		
//		ois.close();
//		System.out.println(cliente.getNome());

	}

}
