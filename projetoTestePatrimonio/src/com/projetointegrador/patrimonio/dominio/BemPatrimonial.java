package com.projetointegrador.patrimonio.dominio;

import java.time.LocalDate;

public class BemPatrimonial {
	private int numero;
	private LocalDate data_aquisicao;
	private String descricao;
	private double valor_compra;
	private String departamento;
	private int sala;
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	
}
