package no.hvl.dat100.jplab11.oppgave1;

import no.hvl.dat100.jplab11.common.TODO;

public abstract class Innlegg {
	
	protected int id;
	protected String bruker;
	protected String dato;
	protected int likes;
	
	public Innlegg() {
		
	}
	
	public Innlegg(int id, String bruker, String dato) {

		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		likes = 0;
	}

	public Innlegg(int id, String bruker, String dato, int likes) {

		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;
	}
	
	public String getBruker() {
		
		return bruker;
	}

	public void setBruker(String bruker) {
		
		this.bruker = bruker;
	}

	public String getDato() {
		
		return dato;
	}

	public void setDato(String dato) {
		
		this.dato = dato;
	}

	public int getId() {
		
		return id;
	}
	
	public void setId(int id) {
		
		this.id = id;
	}

	public int getLikes() {
		
		return likes;
	}
	
	public void doLike () {
		
		for(int i = 0; i < id; i++) {
			likes += 1;
		}
		
	}
	
	public boolean erLik(Innlegg innlegg) {

		boolean erLik = true;
		
		if(this == innlegg) {
			
			return erLik;
		}
		
		return !erLik;

	}
	
	@Override
	public String toString() {
		
		String str;
		str = id + "\n" + bruker + "\n" + dato + "\n" + likes + "\n";
		
		return str;
				
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
