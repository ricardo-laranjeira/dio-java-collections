package com.collections;

import java.util.HashMap;
import java.util.Map;

import com.objetos.ProdutoMap;

public class Estoque {
	
	private Map<Long, ProdutoMap> estoqueProduto;

	public Estoque() {
		this.estoqueProduto = new HashMap<>();
	}
	
	public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
		estoqueProduto.put(codigo, new ProdutoMap(nome, preco, quantidade));
	}
	
	public void exibirProdutos() {
		System.out.println(estoqueProduto);
	}
	
	public double calcularValorTotalEstoque() {
		double total = 0;
		if(!estoqueProduto.isEmpty()) {
			for(ProdutoMap produto : estoqueProduto.values()) {
				total += (produto.getPreco() * produto.getQuantidade());
			}
		}
		return total;
	}
	
	public ProdutoMap produtoMaisCaro() {
		ProdutoMap produtoMaisCaro = null;
		double maiorPreco = Double.MIN_NORMAL;
		if (!estoqueProduto.isEmpty()) {
			for (ProdutoMap produto : estoqueProduto.values()) {
				if(produto.getPreco() > maiorPreco) {
					produtoMaisCaro = produto;
				}
			}
		}
		return produtoMaisCaro;
	}
	
	public static void main(String[] args) {
		Estoque estoque = new Estoque();
		estoque.exibirProdutos();
		for(int i = 0; i < 5; i++) {
			estoque.adicionarProduto(i, "Produto " + (i+1), 5.0 * (i+1), 10 * (i+1));
		}
		estoque.exibirProdutos();
		System.out.println("Valor estoque: " + estoque.calcularValorTotalEstoque());
		System.out.println("Produto mais caro: " + estoque.produtoMaisCaro());
	}

}
