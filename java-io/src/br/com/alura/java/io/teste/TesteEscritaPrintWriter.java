package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintWriter {

	public static void main(String[] args) throws IOException {
		//FLUXO DE ENTRADA COM ARQUIVO

//        BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		
//		PrintStream ps = new PrintStream(new File("lorem5.txt"));
		
		PrintWriter pw = new PrintWriter("lorem6.txt");
        
        pw.println("Escrevendo linhas 11111");
        pw.println();
        pw.println("Escrevendo linhas 22222");
        
		pw.close();
		
	}

}
