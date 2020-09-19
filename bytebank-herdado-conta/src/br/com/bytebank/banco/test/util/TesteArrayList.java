package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		
		//<Conta> (generics) indica que o array receberá apenas tipo conta
		ArrayList<Conta> lista = new ArrayList<Conta>(); 
		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);
		Conta cc1 = new ContaCorrente(22, 22);
		lista.add(cc1);		

		System.out.println(lista.size());
		
		Conta ref = lista.get(0);
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		
		System.out.println(lista.size());
 
		Conta cc2 = new ContaCorrente(23, 313);
		lista.add(cc2);
		Conta cc3 = new ContaCorrente(23, 442);
		lista.add(cc3);				

		for (int i = 0; i < lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);			
		}
		
		for (Conta conta: lista) {
			System.out.println(conta);
		}
		
	}

}
