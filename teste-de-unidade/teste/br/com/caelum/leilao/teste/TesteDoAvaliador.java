package br.com.caelum.leilao.teste;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.caelum.leilao.builder.CriadorDeLeilao;
import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Leilao;
import br.com.caelum.leilao.dominio.Usuario;
import br.com.caelum.leilao.servico.Avaliador;

public class TesteDoAvaliador { 
	
	private Avaliador leiloeiro;
	private Usuario joao;
	private Usuario jose;
	private Usuario maria;
	private Leilao leilao;
	
	
	@Before
	public void criaAvaliador() {
		leiloeiro = new Avaliador();
		this.joao = new Usuario("João");
		this.jose = new Usuario("José");
		this.maria = new Usuario("Maria");		
		this.leilao = new Leilao("Playstation 5 novo");
	}
	@Test
	public void deveEntenderLancesEmOrdemCrescente() {
		
		leilao.propoe(new Lance(joao, 230.00));
		leilao.propoe(new Lance(jose, 350.00));
		leilao.propoe(new Lance(maria, 400.00));
		
		// parte 2 = ação
		leiloeiro.avalia(leilao);
		
		// parte 3: validação
		double maiorEsperado = 400;
		double menorEsperado = 230;
		
		assertEquals(menorEsperado, leiloeiro.getMenorLance(), 0.00001);		
		assertEquals(maiorEsperado, leiloeiro.getMaiorLance(), 0.00001);		
		
	}
	@Test
	public void deveEntenderLeilaoComApenasUmLance() {
		
		leilao.propoe(new Lance(joao, 1000.00));
		
		// parte 2 = ação
		leiloeiro.avalia(leilao);
		
		// parte 3: validação
		double maiorEsperado = 1000;
		double menorEsperado = 1000;
		
		assertEquals(menorEsperado, leiloeiro.getMenorLance(), 0.00001);
		assertEquals(maiorEsperado, leiloeiro.getMaiorLance(), 0.00001);		
		
	}
	@Test
	public void deveEncontrarOsTresMaioresLances() {
     	
     	Leilao leilao = new CriadorDeLeilao().para("XBox One")
     			.lance(joao, 100.0)
     			.lance(maria, 200.0)
     			.lance(joao, 300.0)
     			.lance(maria, 400.0)
     			.constroi();
     	
		leiloeiro.avalia(leilao);
		
		List<Lance> maiores = leiloeiro.getTresMaiores();
		assertEquals(3, maiores.size());
		assertEquals(200, maiores.get(0).getValor(), 0.00001);
		assertEquals(150, maiores.get(1).getValor(), 0.00001);
		assertEquals(110, maiores.get(2).getValor(), 0.00001);
	}
	
	@After
	public void finaliza() {
	  System.out.println("fim");
	}
}
