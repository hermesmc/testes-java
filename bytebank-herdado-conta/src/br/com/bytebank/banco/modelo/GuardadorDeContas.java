package br.com.bytebank.banco.modelo;

public class GuardadorDeContas {

	private Conta[] referencias;
	private int posicaolivre;
	
	public GuardadorDeContas() {
		this.referencias = new Conta[10];
		this.posicaolivre = 0;
	}
	
	public void adiciona(Conta ref) {
		this.referencias[this.posicaolivre] = ref;
		this.posicaolivre++;
	}

	public int getQuantidadeDeElementos() {
		// TODO Auto-generated method stub
		return this.posicaolivre;
	}

	public Conta getReferencia(int i) {
		// TODO Auto-generated method stub
		return this.referencias[i];
	}


}
