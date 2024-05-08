/**
* Comparator 
*/

package com.collections;

import java.util.Comparator;

import com.objetos.Pessoa;

public class ComparatorPorAltura implements Comparator<Pessoa> {

	@Override
	public int compare(Pessoa p1, Pessoa p2) {
		return Double.compare(p1.getAltura(), p2.getAltura());
	}

}
