package com.collections;

import java.util.HashMap;
import java.util.Map;

public class Agenda {
	
	private Map<String, Integer> agendaMap;

	public Agenda() {		
		this.agendaMap = new HashMap<>();
	}
	
	public void adicionarContato(String nome, Integer numero) {
		agendaMap.put(nome, numero);
	}
	
	public void removerContato(String nome) {
		if(!agendaMap.isEmpty()) {
			agendaMap.remove(nome);
		}
	}
	
	public void exibirContato() {
		System.out.println(agendaMap);
	}
	
	public Integer pesquisarPorNome(String nome) {
		Integer numeroPorNome = null;
		if(!agendaMap.isEmpty()) {
			numeroPorNome = agendaMap.get(nome);
		}
		return numeroPorNome;
	}
	
	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		for (int i = 0; i < 5; i++) {
			agenda.adicionarContato("Contato " + (i+1), 11111111 * (i+1));
		}
		System.out.println("1- Exibindo contatos");
		agenda.exibirContato();		
		
		agenda.removerContato("Contato 3");
		
		System.out.println("2- Exibindo contatos");
		agenda.exibirContato();
		
		System.out.println("O numero pesquisado eh: " + agenda.pesquisarPorNome("Contato 4"));
	}

}
