package br.com.bytebank.banco.test;

import java.util.ArrayList;
import java.util.Collection;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class TesteArrayCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Conta> lista = new ArrayList();
		
		Conta cc = new ContaCorrente(22 , 11);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(22 , 22);
		lista.add(cc2);

		System.out.println("Tamanho: " + lista.size());
		Conta ref = lista.get();
		System.out.println(ref.getNumero());	
		

	}	

}
