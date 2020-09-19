package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteFileWriter {

	public static void main(String[] args) throws IOException {
		//FLUXO DE ENTRADA COM ARQUIVO
		
      BufferedWriter bw = new BufferedWriter(new FileWriter("lorem4.txt"));
        
      bw.write("Primeira linha");
      bw.newLine();
      bw.write("Primeira linha");        

		bw.close();
		
	}

}
