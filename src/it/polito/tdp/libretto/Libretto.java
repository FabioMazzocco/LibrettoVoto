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
	 * @return {@code true} nel caso normale, {@code false} se non � riuscito
	 * 			ad aggiungere il voto
	 */
	public boolean add(Voto v) {
		if(!this.esisteGiaVoto(v) && !this.votoConflitto(v)) {
			voti.add(v);
			return true;
		}
		return false;
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
	 * @return l'oggetto di tipo {@link Voto} con il nome del corso cercato (oppure null se non � presente)
	 */
	public Voto cercaCorso(String corso) {
		/*
		 * Va bene quello fatto sotto, ma non ce n'� bisogno, � un'operazione gi� definita da list.indexOf()
		 * 
		for(Voto v : voti)
			if(v.getCorso().equals(corso))
				return v;
		return null;
		*
		*Allora posso fare un'altra cosa: cerco il voto (oggetto) come Voto parzialmente costruito
		*ma serve solo come criterio di ricerca, perch� controller� solo il nome esame (corso) perch�
		*confronta tramite il metodo equals che abbiamo implementato
		*/
		Voto voto = new Voto(0, corso, null);
		int pos = this.voti.indexOf(voto);
		if(pos== -1)
			return null;
		return voti.get(pos);
	}
	
	/**
	 * Dato un voto, controlla se esiste gi� un voto con uguale corso ed uguale punteggio
	 * @param v il {@link Voto} che viene cercato nella lista gi� presente 
	 * @return {@code true} se c'�, {@code false} se non � ancora presente
	 */
	public boolean esisteGiaVoto(Voto v) {
		int pos = this.voti.indexOf(v);
		if(pos == -1)
			return false;
		if(v.getVotazione() == this.voti.get(pos).getVotazione())
			return true;
		return false;
		
		/*
		 * Si, ma inutile andare a chiamare tutte queste cose quando � pi� semplice la versione sopra
		Voto trovato = this.cercaCorso(v.getCorso());
		if(trovato == null)
			return false;
		if(trovato.getVotazione() == v.getVotazione())
			return true;
		return false;
		*/
	}
	
	/**
	 * Mi dice se {@ink Voto} {@link v} � in conflitto con uno dei voti 
	 * esistenti. Se il voto non esiste, non c'� conflitto. Se esiste ed 
	 * ha un punteggio diverso, c'� conflitto.
	 * 
	 * @param v 
	 * @return {@code true} se il voto esiste ed ha un punteggio diverso,
	 * 			{@code false} se il voto non esiste o ha un punteggio uguale
	 */
	public boolean votoConflitto(Voto v) {
		int pos = this.voti.indexOf(v);
		if(pos == -1)
			return false;
		if(v.getVotazione() == this.voti.get(pos).getVotazione())
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Libretto [voti=" + voti + "]";
	}
	
	
	
}
