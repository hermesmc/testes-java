package br.com.bytebank.banco.test.util;

public class TesteOutrosWrappers {

	public static void main(String[] args) {

		Integer idadeRef = Integer.valueOf(29); //autoboxing
		int valor = idadeRef.intValue();        //unboxing
		System.out.println(valor);      

		Double doubleRef = Double.valueOf(3.2); //autoboxing
		System.out.println(doubleRef.doubleValue()); //unboxing

		Boolean booleanRef = Boolean.TRUE; //autoboxing
		System.out.println(booleanRef.booleanValue()); //unboxing
		
	}

}
