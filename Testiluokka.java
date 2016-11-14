/**
 * 
 */
package fi.agileo.test;

import testiluokka.koira;


public class Testiluokka {

	
	public static void main(String[] args){
		



Kissa katti = new Kissa();
Koira musti = new Koira();

katti.nimi = "mirri";
musti.nimi = "musti";

Kissa[] kissat = new Kissa[2];

System.out.println("\n"+katti.nimi + "\n" + musti.nimi);

katti.Karkuun(musti);
musti.jahtaa(katti);
		
	}

}
