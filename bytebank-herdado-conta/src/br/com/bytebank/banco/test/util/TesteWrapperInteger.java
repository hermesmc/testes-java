package br.com.bytebank.banco.test.util;

public class TesteWrapperInteger {

	public static void main(String[] args) {

		int[] idades = new int[5];
		String[] nome = new String[5];
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);  //Pergunta de certificação Java
		System.out.println(Integer.BYTES); //Pergunta de certificação Java
		
		
		int Idade = 29;
		Integer idadeRef = Integer.valueOf(29); //autoboxing
		int valor = idadeRef.intValue();        //unboxing
		
		String s = args[0];
		//Integer numero = Integer.valueOf(s);
		
		int numero = Integer.parseInt(s); 
		System.out.println(numero);
		

	}

}
