package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

		boolean skrevet = true;
		String filePath = mappe + filnavn;
		
		try {
			
			PrintWriter file = new PrintWriter(filePath);
			
			file.println(samling.toString());
			file.println(":)"); //test for å se om det blir skrevet i blogg.dat når man kjører TestSkrivBlogg.java
			file.close();
			
		}
		
		catch(Exception e) {
			
			System.out.println("Kunne ikke skrive i fil!!!");
			
			return !skrevet;
			
		}
		
		return skrevet;
		
	}
}
