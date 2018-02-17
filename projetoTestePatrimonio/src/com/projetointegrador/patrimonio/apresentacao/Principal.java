package com.projetointegrador.patrimonio.apresentacao;

import java.time.LocalDate;
import java.time.Month;

public class Principal {
	public static void main(String[] args) {
		
		LocalDate hoje = LocalDate.now();
		LocalDate anoPassado = LocalDate.of(2019, Month.MARCH, 23);
		System.out.println(hoje);
		System.out.println(anoPassado);
		
		if (hoje.isBefore(anoPassado))
			System.out.println("Hoje está mais antigo");
		else
			System.out.println("Hoje está mais atual");
	}
}
