import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		palavras.add("Alura online");
		palavras.add("Casa do código Marota");
		palavras.add("Dante De Alegeri");
		palavras.add("Caelum");
		
		System.out.println("Exemplo 1 --------------");
		Collections.sort(palavras);
		System.out.println(palavras);
		
		System.out.println("Exemplo 2 --------------");
		Comparator<String> comparador = new ComparadorPorTamanho();
		Collections.sort(palavras, comparador);
		System.out.println(palavras);
		
		System.out.println("Exemplo 3 --------------");
		palavras.sort(comparador);
		System.out.println(palavras);
		
		System.out.println("Exemplo 4 --------------");
		for (String p : palavras) {
			System.out.println(p);		
		}		
		
		System.out.println("Exemplo 5 --------------");
		Consumer<String> consumidor = new ImprimeNaLinha();
		palavras.forEach(consumidor);
		
		
	}
}

class ImprimeNaLinha implements Consumer<String>{

	@Override
	public void accept(String s) {
		System.out.println(s);		
	}
	
}

class ComparadorPorTamanho implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		if(s1.length() < s2.length()) 
			return -1;
		if(s1.length() > s2.length()) 
			return 1;
		return 0;									
	}		
	
}
