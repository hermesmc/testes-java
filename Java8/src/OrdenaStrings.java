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
	   	Consumer<String> consumidor = new Consumer<String>() {
	 		@Override
			public void accept(String s) {
				System.out.println(s);				
			}
	   	};
//		Consumer<String> consumidor = new ImprimeNaLinha(); 
//		palavras.forEach(consumidor);

//		palavras.forEach(new Consumer<String>() {
//			@Override
//				public void accept(String s) {
//					System.out.println(s);				
//				}
//			}
//		);		

		// Lambda
		palavras.forEach((String s) -> {
			System.out.println(s);		
		});

		// Lambda mais simples ainda
		palavras.forEach(s -> System.out.println(s));
		
		//Lambda do exemplo 3
		System.out.println("Exemplo 6 --------------");
		
		palavras.sort((String s1, String s2) -> {
				if (s1.length() < s2.length())
					return -1;
				if (s1.length() > s2.length())
					return 1;
				return 0;
		});
		
		//Lambda do exemplo 4
//		System.out.println("Exemplo 7 --------------");
//		
//		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
//		System.out.println(palavras);
//		palavras.forEach(s -> System.out.println(s));
		
		//Lambda do exemplo 5
		System.out.println("Exemplo 8 --------------");
		palavras.sort((Comparator.comparing(s -> s.length())));
		System.out.println(palavras);

		//Lambda do exemplo 6
		System.out.println("Exemplo 9 --------------");
		palavras.sort((Comparator.comparing(String::length)));
		System.out.println(palavras);		
		
		//Method Reference
		System.out.println("Exemplo 10 --------------");
		Consumer<String> impressor = System.out::println;
		palavras.forEach(impressor);
		
	}
	
}

//class ImprimeNaLinha implements Consumer<String>{
//
//	@Override
//	public void accept(String s) {
//		System.out.println(s);		
//	}
//	
//}

class ComparadorPorTamanho implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		if (s1.length() < s2.length())
			return -1;
		if (s1.length() > s2.length())
			return 1;
		return 0;
	}

}
