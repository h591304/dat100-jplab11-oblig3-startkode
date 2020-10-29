package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	Innlegg[] innleggtabell;
	int nesteledig;

	public Blogg() {
		innleggtabell = new Innlegg[20];
		
	}

	public Blogg(int lengde) {
		innleggtabell = new Innlegg[lengde];
		nesteledig = 0;
		
	}

	public int getAntall() {
		return nesteledig;
	}
	
	public Innlegg[] getSamling() {
		
		return innleggtabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {

		int funnetPos = -1;
		int pos;
		
		for(pos = 0; pos < innleggtabell.length; pos++) {
			
			if(innleggtabell[pos].erLik(innlegg)) {
				funnetPos = pos;
			}
		}
		return funnetPos;
	}

	public boolean finnes(Innlegg innlegg) {
		boolean finnes = true;
		int i;
		
		for(i = 0; i < nesteledig; i++) {
			if(innlegg.getId() == innleggtabell[i].getId()) {
				return finnes;
			}
			else {
				continue;
			}
		}
		
		return !finnes;
	}

	public boolean ledigPlass() {
		
		boolean ledigPlass = true;
		
		if(nesteledig < innleggtabell.length) {
			return ledigPlass;
			
		}
		
		return !ledigPlass;
	}
	
	public boolean leggTil(Innlegg innlegg) {

		boolean leggTil = true;
		
		if(nesteledig < innleggtabell.length) {
			innleggtabell[nesteledig] = innlegg;
			nesteledig++;
			return leggTil;
		}
		
		else {
			return !leggTil;
		}
	}
	
	public String toString() {
		String str = nesteledig + "\n";
		int i;
		
		for(i = 0; i < nesteledig; i++) {
			
			str += innleggtabell[i].toString();
			
		}
		
		return str;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}