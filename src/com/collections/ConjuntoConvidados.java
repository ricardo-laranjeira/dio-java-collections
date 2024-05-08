/**
* HashSet
*/

package com.collections;

import java.util.HashSet;
import java.util.Set;

import com.objetos.Convidado;

public class ConjuntoConvidados {
	
	private Set<Convidado> convidadoSet;

	public ConjuntoConvidados() {
		this.convidadoSet = new HashSet<>();
	}
	
	public void adicionarConvidado(String nome, int codigoConvite) {
		convidadoSet.add(new Convidado(nome, codigoConvite));
	}
	
	public void removerConvidadoPorCodigoConvite(int codigoConvite) {
		Convidado convidadoParaRemover = null;
		for(Convidado c : convidadoSet) {
			if (c.getCodigoConvite() == codigoConvite) {
				convidadoParaRemover = c;
				break;
			}
		}
		convidadoSet.remove(convidadoParaRemover);
	}
	
	public int contarConvidados() {
		return convidadoSet.size();
	}
	
	public void exibirConvidados() {
		System.out.println(convidadoSet);
	}
	
	public static void main(String[] args) {
		ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
		
		System.out.println("1- Existem " + conjuntoConvidados.contarConvidados() + " convidado(s)");
		
		for(int i = 0; i < 5; i++) {
			conjuntoConvidados.adicionarConvidado("Convidado " + (i+1), 1254 + (i+1));
		}
		
		conjuntoConvidados.adicionarConvidado("Convidado 6", 1258);
		
		conjuntoConvidados.exibirConvidados();
		
		System.out.println("2- Existem " + conjuntoConvidados.contarConvidados() + " convidado(s)");
		
		conjuntoConvidados.removerConvidadoPorCodigoConvite(1257);
		
		System.out.println("3- Existem " + conjuntoConvidados.contarConvidados() + " convidado(s)");
	}

}
