package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.objetos.Pessoa;

public class OrdenacaoPessoa {
	
	private List<Pessoa> pessoaList;

	public OrdenacaoPessoa() {
		this.pessoaList = new ArrayList<>();
	}
	
	public void adicionarPessoa(String nome, int idade, double altura) {
		pessoaList.add(new Pessoa(nome, idade, altura));
	}
	
	public List<Pessoa> ordenarPorIdade() {
		List<Pessoa> listaPorIdade = new ArrayList<>(pessoaList);
		Collections.sort(listaPorIdade);
		return listaPorIdade;
	}
	
	public List<Pessoa> ordenarPorAltura() {
		List<Pessoa> listaPorAltura = new ArrayList<>(pessoaList);
		Collections.sort(listaPorAltura, new ComparatorPorAltura());
		return listaPorAltura;
	}
	
	public static void main(String[] args) {
		
		OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
		
		for(int i = 0; i<5; i++) {
			ordenacaoPessoa.adicionarPessoa("Pessoa " + (i+1), (20+1), 1.9 - (i * 0.1));
		}
		
		System.out.println("Por idade: " + ordenacaoPessoa.ordenarPorIdade());
		System.out.println("Por altura: " + ordenacaoPessoa.ordenarPorAltura());
	}

}
