package br.com.caelum.leilao.teste;

import static org.junit.Assert.assertEquals;

import java.util.List;

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
		
		assertEquals(menorEsperado, leiloeiro.getMenorLance(), 0.00001);		
		assertEquals(maiorEsperado, leiloeiro.getMaiorLance(), 0.00001);		
		
	}
	@Test
	public void deveEntenderLeilaoComApenasUmLance() {
		// parte 1 = cenário
		Usuario joao = new Usuario("João");
		Leilao leilao = new Leilao("Playstation 5 novo");
		
		leilao.propoe(new Lance(joao, 1000.00));
		
		// parte 2 = ação
		Avaliador leiloeiro = new Avaliador();
		leiloeiro.avalia(leilao);
		
		// parte 3: validação
		double maiorEsperado = 1000;
		double menorEsperado = 1000;
		
		assertEquals(menorEsperado, leiloeiro.getMenorLance(), 0.00001);
		assertEquals(maiorEsperado, leiloeiro.getMaiorLance(), 0.00001);		
		
	}
	@Test
	public void deveEncontrarOsTresMaioresLances() {
		Usuario joao = new Usuario("João");
		Usuario maria = new Usuario("Maria");
		Leilao leilao = new Leilao("Playstation 5 novo");
		
		leilao.propoe(new Lance(joao, 100.00));
		leilao.propoe(new Lance(maria, 110.00));
	    leilao.propoe(new Lance(joao, 150.00));
     	leilao.propoe(new Lance(maria, 200.00));     	
     	
		Avaliador leiloeiro = new Avaliador();
		leiloeiro.avalia(leilao);
		
		List<Lance> maiores = leiloeiro.getTresMaiores();
		assertEquals(3, maiores.size());
		assertEquals(200, maiores.get(0).getValor(), 0.00001);
		assertEquals(150, maiores.get(1).getValor(), 0.00001);
		assertEquals(110, maiores.get(2).getValor(), 0.00001);
	}
}
