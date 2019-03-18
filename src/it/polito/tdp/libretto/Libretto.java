package it.polito.tdp.libretto;

import java.util.*;

public class Libretto {
	private List<Voto> voti;
	
	public Libretto() {
		this.voti = new ArrayList<Voto>();
	}
	
	/**
	 * Aggiunge un nuovo voto al libretto
	 * 
	 * @param v il {@link Voto} da aggiungere
	 */
	public void add(Voto v) {
		voti.add(v);
	}
	
//	public String toString() {
//		return voti.toString() ;
//	}
	
	/**
	 * Seleziona il sottoinsieme di voti con la votazione passata
	 * @param votazione votazione da ricercare tra gli esami presenti
	 * @return lista di [@link Voto} aventi la votazione cercata (eventualmente vuota)
	 */
	public List<Voto> cercaVoti(int votazione) {
		List<Voto> lista = new ArrayList<Voto>();
	
		for(Voto v : voti)
			if(v.getVotazione() == votazione)
				lista.add(v);
		
		return lista;
	}
	
	
	
}
