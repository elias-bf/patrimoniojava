package com.projetointegrador.patrimonio.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BemPatrimonial {
	private int numero;
	private LocalDate data_aquisicao;
	private String descricao;
	private double valor_compra;
	private String departamento;
	private int sala;
	private List<OrdemServico> relacaoOS = new ArrayList<>();
	
	public BemPatrimonial(int numero, LocalDate data_aquisicao, String descricao, double valor_compra,
			String departamento, int sala) {
		this.numero = numero;
		this.data_aquisicao = data_aquisicao;
		this.descricao = descricao;
		this.valor_compra = valor_compra;
		this.departamento = departamento;
		this.sala = sala;
	}

	public int getNumero() {
		return numero;
	}

	public LocalDate getData_aquisicao() {
		return data_aquisicao;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getValor_compra() {
		return valor_compra;
	}

	public String getDepartamento() {
		return departamento;
	}

	public int getSala() {
		return sala;
	}
	
	public void adiciona(OrdemServico os) {
		relacaoOS.add(os);
	}
	
	public void remove(OrdemServico os) {
		relacaoOS.remove(os);
	}
	
	public int qtdeServicos() {
		return relacaoOS.size();
	}
	
	public double gastoAcumulado() {
		double total = 0;
		for (OrdemServico os : relacaoOS) {
			total += os.getOrcamentoEscolhido().getValor();
		}
		return total;
	}
		
}
