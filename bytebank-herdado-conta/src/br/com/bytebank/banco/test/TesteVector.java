package br.com.bytebank.banco.test;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class TesteVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Conta> lista = new Vector<Conta>(); //Thread safe
		
		Conta cc = new ContaCorrente(22 , 11);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(22 , 22);
		lista.add(cc2);
		
		System.out.println("Tamanho: " + lista.size());
		
		Conta ref = lista.get(0);
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		
		System.out.println("Tamanho: " + lista.size());
		
		Conta cc3 = new ContaCorrente(22 , 131);
		lista.add(cc3);
		
		Conta cc4 = new ContaCorrente(24 , 322);
		lista.add(cc4);
		
		for (Conta conta: lista) {
			System.out.println(conta);
		}
		
	}	

}
