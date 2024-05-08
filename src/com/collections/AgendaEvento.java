package com.collections;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import com.objetos.Evento;

public class AgendaEvento {
	
	private Map<LocalDate, Evento> eventosMap;

	public AgendaEvento() {
		this.eventosMap = new HashMap<>();
	}
	
	public void adicionarEvento(LocalDate data, String nome, String atracao) {
		eventosMap.put(data, new Evento(nome, atracao));
	}
	
	public void exibirEventos() {
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
		System.out.println(eventosTreeMap);
	}
	
	public void proximoEvento() {
		// Set<LocalDate> dataset = eventosMap.keySet();
		// Collection<Evento> values = eventosMap.values();
		LocalDate dataAtual = LocalDate.now();
		
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
		
		for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
			if(entry.getKey().equals(dataAtual) || entry.getKey().isAfter(dataAtual)) {
				System.out.println("Proximo evento " + entry.getValue() + "na data " + entry.getKey());
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		AgendaEvento agendaEvento = new AgendaEvento();
		agendaEvento.adicionarEvento(LocalDate.of(2024, 3, 23), "Evento 1", "UMF");
		agendaEvento.adicionarEvento(LocalDate.of(2024, 5, 18), "Evento 2", "Tomorrowland");
		
		agendaEvento.exibirEventos();
		
		agendaEvento.proximoEvento();
	}	

}
