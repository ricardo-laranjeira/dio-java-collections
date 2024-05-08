/**
* HashSet 
*/

package com.collections;

import java.util.HashSet;
import java.util.Set;

import com.objetos.Contato;

public class AgendaContato {
	
	private Set<Contato> contatoSet;

	public AgendaContato() {
		this.contatoSet = new HashSet<>();
	}
	
	public void adicionarContato(String nome, int numero) {
		contatoSet.add(new Contato(nome, numero));
	}
	
	public void exibirContatos() {
		System.out.println(contatoSet);
	}
	
	public Set<Contato> pesquisarPorNome(String nome){
		Set<Contato> contatoPorNome = new HashSet<>();
		for(Contato c : contatoSet) {
			if(c.getNome().startsWith(nome)) {
				contatoPorNome.add(c);
			}
		}
		return contatoPorNome;
	}
	
	public Contato atualizaContato(String nome, int novoNumero) {
		Contato contatoAtualizado = null;
		for(Contato contato : contatoSet) {
			if(contato.getNome().equalsIgnoreCase(nome)) {
				contato.setNumero(novoNumero);
				contatoAtualizado = contato;
				break;
			}
		}
		return contatoAtualizado;
	}
	
	public static void main(String[] args) {
		AgendaContato agendaContato = new AgendaContato();
		
		System.out.println("1- Exibir contatos");
		
		agendaContato.exibirContatos();
		
		agendaContato.adicionarContato("Contato Teste", 65324);
		
		for(int i = 0; i < 5; i++) {
			agendaContato.adicionarContato("Contato " + (i+1), ((i+1) * 11111));
		}
		
		System.out.println("2- Exibir contatos");
		
		agendaContato.exibirContatos();
		
		System.out.println("Pesquisa");
		
		System.out.println(agendaContato.pesquisarPorNome("Contato Teste"));
		
		System.out.println("Contato atualizado: " + agendaContato.atualizaContato("Contato Teste", 98985));
	}

}
