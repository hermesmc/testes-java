package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.GuardadorDeReferencias;

public class TesteGuardadorDeReferencias {

	public static void main(String[] args) {

		GuardadorDeReferencias guardador = new GuardadorDeReferencias();	
		
		Conta cc = new ContaCorrente(22, 11);
		guardador.adiciona(cc);
		Conta cc1 = new ContaCorrente(22, 22);
		guardador.adiciona(cc1);
		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		
		Conta ref = (Conta) guardador.getReferencia(1); // Type Cast Conta
		System.out.println(ref.getNumero());
		
	}
}
