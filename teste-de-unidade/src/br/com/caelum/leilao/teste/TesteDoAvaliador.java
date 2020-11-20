package br.com.caelum.leilao.teste;

import org.junit.Assert;
import org.junit.Test;

import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Leilao;
import br.com.caelum.leilao.dominio.Usuario;
import br.com.caelum.leilao.servico.Avaliador;

public class TesteDoAvaliador {
	@Test
	public void deveEntenderLancesEmOrdemCrescente() {
		// parte 1 = cenário
		Usuario joao = new Usuario("João");
		Usuario jose = new Usuario("José");
		Usuario maria = new Usuario("Maria");
		
		Leilao leilao = new Leilao("Playstation 5 novo");
		
		leilao.propoe(new Lance(joao, 230.00));
		leilao.propoe(new Lance(jose, 350.00));
		leilao.propoe(new Lance(maria, 400.00));
		
		// parte 2 = ação
		Avaliador leiloeiro = new Avaliador();
		leiloeiro.avalia(leilao);
		
		// parte 3: validação
		double maiorEsperado = 400;
		double menorEsperado = 230;
		
		Assert.assertEquals(menorEsperado, leiloeiro.getMenorLance(), 0.00001);
		Assert.assertEquals(maiorEsperado, leiloeiro.getMaiorLance(), 0.00001);		
		
	}
	
}
