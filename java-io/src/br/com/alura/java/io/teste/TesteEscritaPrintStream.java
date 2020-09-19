package br.com.alura.java.io.teste;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class TesteEscritaPrintStream {

	public static void main(String[] args) throws IOException {
		//FLUXO DE ENTRADA COM ARQUIVO

//        BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		
		PrintStream ps = new PrintStream(new File("lorem5.txt"));
        
        ps.println("Escrevendo linhas 11111");
        ps.println();
        ps.println("Escrevendo linhas 22222");
        
		ps.close();
		
	}

}
