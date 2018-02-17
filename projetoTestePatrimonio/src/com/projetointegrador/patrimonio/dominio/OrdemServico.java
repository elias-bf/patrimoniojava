package com.projetointegrador.patrimonio.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OrdemServico {
	private int codigo;
	private LocalDate dataSolicitacao;
	private String descricaoDefeito;
	private LocalDate dataConclusao;
	private int urgencia;
	private BemPatrimonial bem;
	private Orcamento orcamentoEscolhido;
	private char situacao;
	
	private List<Orcamento> relacaoOrcamentos = new ArrayList<>();

	public OrdemServico(int codigo, LocalDate dataSolicitacao, String descricaoDefeito, int urgencia,
			BemPatrimonial bem) {
		this.codigo = codigo;
		this.dataSolicitacao = dataSolicitacao;
		this.descricaoDefeito = descricaoDefeito;
		this.urgencia = urgencia;
		this.bem = bem;
		this.situacao = 'A';
	}

	public int getCodigo() {
		return codigo;
	}

	public LocalDate getDataSolicitacao() {
		return dataSolicitacao;
	}

	public String getDescricaoDefeito() {
		return descricaoDefeito;
	}

	public LocalDate getDataConclusao() {
		return dataConclusao;
	}

	public int getUrgencia() {
		return urgencia;
	}

	public char getSituacao() {
		return situacao;
	}

	public BemPatrimonial getBem() {
		return bem;
	}

	public Orcamento getOrcamentoEscolhido() {
		return orcamentoEscolhido;
	}

	
	
	public void adicionar(Orcamento orc) {
		relacaoOrcamentos.add(orc);
	}
	
	public void remover(Orcamento orc) {
		relacaoOrcamentos.remove(orc);
	}
	
	public void concluir(LocalDate dtConclusao) {
		//procura o orçamento com menor valor e o define como o orçamento escolhido
		this.orcamentoEscolhido = this.escolherOrcamento();

		//atualização a situação da ordem de serviço para fechada
		//grava a data de conclusão
		if (dtConclusao == null)
			dtConclusao = LocalDate.now();
		this.situacao = 'F';
		this.dataConclusao = dtConclusao;
	}

	private Orcamento escolherOrcamento() {
		double menorValor = 0;
		Orcamento orcamento = null;
		
		//Se situacao = a 1, prioridade é do menor preço
		for (Orcamento o : relacaoOrcamentos) {
			if (menorValor < o.getValor() ) {
				menorValor = o.getValor();
				orcamento = o;
			}
		}
		return orcamento;
	}
	

}
