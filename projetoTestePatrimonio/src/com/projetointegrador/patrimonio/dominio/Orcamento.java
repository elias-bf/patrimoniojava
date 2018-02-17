package com.projetointegrador.patrimonio.dominio;

import java.time.LocalDate;

public class Orcamento {
	private int codigo;
    private LocalDate data;
    private int prazoDias;
    private double valor;
    private String empresa;
    private String telefone;
    private OrdemServico ordemServico;
    
    
	public Orcamento(int codigo, LocalDate data, int prazoDias, double valor, String empresa, String telefone,
			OrdemServico os) {
		this.codigo = codigo;
		this.data = data;
		this.prazoDias = prazoDias;
		this.valor = valor;
		this.empresa = empresa;
		this.telefone = telefone;
		this.ordemServico = os;
	}


	public int getCodigo() {
		return codigo;
	}


	public LocalDate getData() {
		return data;
	}


	public int getPrazoDias() {
		return prazoDias;
	}


	public double getValor() {
		return valor;
	}


	public String getEmpresa() {
		return empresa;
	}


	public String getTelefone() {
		return telefone;
	}


	public OrdemServico getOrdemServico() {
		return ordemServico;
	}
	
	
    
    

}
