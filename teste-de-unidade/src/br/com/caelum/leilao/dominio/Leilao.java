package br.com.caelum.leilao.dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leilao {

	private String descricao;
	private List<Lance> lances;
	
	public Leilao(String descricao) {
		this.descricao = descricao;
		this.lances = new ArrayList<Lance>();
	}
	
	public void propoe(Lance lance) {
		int total = 0;
		total = qtdLancesDo(lance, total);
		
		if (lances.isEmpty() || (!ultimoLanceDado().getUsuario().equals(lance.getUsuario())) && (total < 5)) {
			lances.add(lance);
		}		
	}

	private int qtdLancesDo(Lance lance, int total) {
		for (Lance l : lances) {
			if(l.getUsuario().equals(lance.getUsuario())) total++;
		}
		return total;
	}

	private Lance ultimoLanceDado() {
		return lances.get(lances.size()-1);
	}

	public String getDescricao() {
		return descricao;
	}

	public List<Lance> getLances() {
		return Collections.unmodifiableList(lances);
	}

	
	
}
