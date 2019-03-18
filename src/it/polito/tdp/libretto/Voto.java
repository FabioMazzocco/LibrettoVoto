package it.polito.tdp.libretto;
import java.time.LocalDate;

public class Voto {
	private int votazione;
	private String corso;
	private LocalDate data;
	public Voto(int voto, String corso, LocalDate data) {
		super();
		this.votazione = voto;
		this.corso = corso;
		this.data = data;
	}
	
	public int getVotazione() {
		return votazione;
	}
	
	public void setVotazione(int votazione) {
		this.votazione = votazione;
	}
	
	public String getCorso() {
		return corso;
	}
	
	public void setCorso(String corso) {
		this.corso = corso;
	}
	
	public LocalDate getData() {
		return data;
	}
	
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	public String toString() {
		return corso+" "+votazione+" "+data.toString();
	}
	
}
