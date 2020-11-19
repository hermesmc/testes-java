import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class datas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		LocalDate olimpiadas = LocalDate.of(2016, 07, 01);
		int data = hoje.getDayOfYear() - olimpiadas.getDayOfYear();
		System.out.println(data);
		System.out.println("----------------------------");
		Period periodo = Period.between(olimpiadas, hoje);
		System.out.println(periodo.getDays());
		
		DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String valorFormatada = olimpiadas.format(dataFormatada);
		
		System.out.println(valorFormatada);
		
		LocalDateTime agora = LocalDateTime.now();
		DateTimeFormatter dataFormatadaComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		System.out.println(agora.format(dataFormatadaComHoras));
		
	}

}
