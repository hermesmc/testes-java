package br.com.alura.java.io.teste;

import java.io.Serializable;

/**
 * Classe que representa um cliente no Bytebank.
 *
 * @author Nico Steppat
 * @version 0.1
 */
public class Cliente implements Serializable {
 
	private static final long serialVersionUID = 1L; //utilizado para controlar a versão da classe, caso mude algum atributo com tipos incompatíveis
	                                                 //o valor deve ser incrementado
	private String nome;
    private String cpf;
    private String profissao;

    public String nomeCpf(String nome, String cpf) {
    	return nome + " " + cpf;
    }
    
    public String nomeCpfProfissao(String nome, String cpf, String profissao) {
    	return nome + " " + cpf + " " + profissao;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getProfissao() {
        return profissao;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

}
