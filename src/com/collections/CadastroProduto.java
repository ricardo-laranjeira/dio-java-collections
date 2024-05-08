package com.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.objetos.Produto;

public class CadastroProduto {
	
	private Set<Produto> produtoSet;

	public CadastroProduto() {
		this.produtoSet = new HashSet<>();
	}
	
	public void adicionarProduto(int codigo, String nome, double preco, int quantidade) {
		produtoSet.add(new Produto(codigo, nome, preco, quantidade));
	}
	
	public Set<Produto> exibirProdutoPorNome(){
		Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
		return produtosPorNome;
	}
	
	public Set<Produto> exibirProdutoPorPreco(){
		Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
		produtosPorPreco.addAll(produtoSet);
		return produtosPorPreco;
	}
	
	public static void main(String[] args) {
		
		CadastroProduto cadastroProduto = new CadastroProduto();
		
		for(int i = 0; i < 5; i++) {
			cadastroProduto.adicionarProduto(i + 1, "Produto " + (i+1), (90.6 / (i+1)), (10 * (i+1)));
		}
		
		System.out.println("Produtos: " + cadastroProduto.produtoSet);
		
		System.out.println("Por Nome: " + cadastroProduto.exibirProdutoPorNome());
		
		System.out.println("Por Preco: " + cadastroProduto.exibirProdutoPorPreco());
	}

}
