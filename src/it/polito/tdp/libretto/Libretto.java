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
	
	
	/**
	 * Seleziona il sottoinsieme di voti con la votazione passata
	 * @param votazione votazione da ricercare tra gli esami presenti
	 * @return lista di {@link Voto} aventi la votazione cercata (eventualmente vuota)
	 */
	public List<Voto> cercaVoti(int votazione) {
		List<Voto> lista = new ArrayList<Voto>();
	
		for(Voto v : voti)
			if(v.getVotazione() == votazione)
				lista.add(v);
		
		return lista;
	}
	
	/**
	 * Trova l'oggetto Voto con il nome passato come parametro
	 * @param corso Stringa con il nome del corso da cercare
	 * @return l'oggetto di tipo {@link Voto} con il nome del corso cercato (oppure null se non è presente)
	 */
	public Voto cercaCorso(String corso) {
		for(Voto v : voti)
			if(v.getCorso().equals(corso))
				return v;
		return null;
	}
	
	/**
	 * Dato un voto, controlla se esiste già un voto con uguale corso ed uguale punteggio
	 * @param nuovoVoto il {@link Voto} che viene cercato nella lista già presente 
	 * @return {@code true} se c'è, {@code false} se non è ancora presente
	 */
	public boolean esisteGiaVoto(Voto nuovoVoto) {
		for(Voto v : voti)
			if(v.equals(nuovoVoto))
				if(v.getVotazione() == nuovoVoto.getVotazione())
					return true;
		return false;
	}
	
}
