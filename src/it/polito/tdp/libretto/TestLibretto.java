package it.polito.tdp.libretto;

import java.time.LocalDate;
import java.util.List;

public class TestLibretto {

	public static void main(String[] args) {
		Libretto l = new Libretto();
		
		l.add(new Voto(30, "Analisi I", LocalDate.of(2017, 1, 15))) ;
		l.add(new Voto(21, "Chimica", LocalDate.of(2017, 1, 25))) ;
		l.add(new Voto(30, "Informatica", LocalDate.of(2017, 2, 15))) ;
		l.add(new Voto(22, "Fisica I", LocalDate.of(2017, 6, 15))) ;
		l.add(new Voto(26, "Algebra lineare e Geometria", LocalDate.of(2017, 7, 15))) ;
		l.add(new Voto(26, "Statistica", LocalDate.of(2018, 1, 15))) ;
		l.add(new Voto(22, "Fisica II", LocalDate.of(2018, 2, 15))) ;
		l.add(new Voto(26, "Analisi II", LocalDate.of(2018, 1, 30))) ;
		l.add(new Voto(30, "Programmazione a Oggetti", LocalDate.of(2019, 2, 15))) ;
		l.add(new Voto(30, "TdP", LocalDate.of(2019, 7, 15))) ;
		
		List<Voto> trenta = l.cercaVoti(30) ;
		System.out.println(trenta) ;
	}

}
