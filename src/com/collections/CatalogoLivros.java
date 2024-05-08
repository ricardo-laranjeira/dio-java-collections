/**
* List 
*/

package com.collections;

import java.util.ArrayList;
import java.util.List;

import com.objetos.Livro;

public class CatalogoLivros {
	
	private List<Livro> livroList;

	public CatalogoLivros() {
		this.livroList = new ArrayList<>();
	}
	
	public void adicionarLivro(String titulo, String autor, int publicacao) {
		livroList.add(new Livro(titulo, autor, publicacao));
	}
	
	public List<Livro> pesquisaPorAutor(String autor){
		List<Livro> livrosPorAutor = new ArrayList<>(); 
		if(!livroList.isEmpty()) {
			for(Livro l : livroList) {
				if(l.getAutor().equalsIgnoreCase(autor)) {
					livrosPorAutor.add(l);
				}
			}
		}
		return livrosPorAutor;
	}
	
	public List<Livro> pesquisaPorIntervaloAno(int anoInicial, int anoFinal){
		List<Livro> livrosPorIntervalo = new ArrayList<>();
		if(!livroList.isEmpty()) {
			for(Livro l : livroList) {
				if(l.getPublicacao() >= anoInicial && l.getPublicacao() <= anoFinal) {
					livrosPorIntervalo.add(l);
				}
			}
		}
		return livrosPorIntervalo;
	}
	
	public Livro pesquisaPorTitulo(String titulo) {
		Livro livroPorTitulo = null;
		if(!livroList.isEmpty()) {
			for(Livro l : livroList) {
				if(l.getTitulo().equalsIgnoreCase(titulo)) {
					livroPorTitulo = l;
					break;
				}
			}
		}
		return livroPorTitulo;
	}
	
	public static void main(String[] args) {
		
		CatalogoLivros catalogoLivros = new CatalogoLivros();
		
		catalogoLivros.adicionarLivro("Livro 1", "Autor 6", 2017);
		
		for(int i = 0; i<=5; i++) {
			catalogoLivros.adicionarLivro("Livro " + (i+1), "Autor "+ (i+1), 2018 + (i+1));
		}
		
		catalogoLivros.adicionarLivro("Livro 6", "Autor 5", 2024);
		
		System.out.println("Pesquisa por autor: " + catalogoLivros.pesquisaPorAutor("Autor 1"));
		
		System.out.println("Pesquisa por ano: " + catalogoLivros.pesquisaPorIntervaloAno(2018, 2020));
		
		System.out.println("Pesquisa por titulo: " + catalogoLivros.pesquisaPorTitulo("Livro 2"));
	}

}
