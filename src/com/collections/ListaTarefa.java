/**
* List 
*/

package com.collections;

import java.util.ArrayList;
import java.util.List;
import com.objetos.Tarefa;

class ListaTarefa {
	private List<Tarefa> tarefaList;

	public ListaTarefa() {
		this.tarefaList = new ArrayList<>();
	}
	
	public void adicionarTarefa(String descricao) {
		tarefaList.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao) {
		List<Tarefa> tarefasRemover = new ArrayList<>();
		for(Tarefa t : tarefaList) {
			if (t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasRemover.add(t);
			}
		}
		tarefaList.removeAll(tarefasRemover);
	}
	
	public int obterNumeroTotaltarefas() {
		return tarefaList.size();
	}
	
	public void obterDescricoesTarefas() {
		System.out.println(tarefaList);
	}
	
	public static void main(String[] args) {
		ListaTarefa listaTarefa = new ListaTarefa();
		
		System.out.println("Numero de tarefas " + listaTarefa.obterNumeroTotaltarefas());
	
		listaTarefa.adicionarTarefa("Tarefa 1");
		listaTarefa.adicionarTarefa("Tarefa 2");
		listaTarefa.adicionarTarefa("Tarefa 3");
		listaTarefa.adicionarTarefa("Tarefa 3");
		System.out.println("Numero de tarefas " + listaTarefa.obterNumeroTotaltarefas());
		
		listaTarefa.removerTarefa("Tarefa 3");
		System.out.println("Numero de tarefas " + listaTarefa.obterNumeroTotaltarefas());
		
		listaTarefa.obterDescricoesTarefas();
	}

}
