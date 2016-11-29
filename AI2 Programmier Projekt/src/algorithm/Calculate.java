package algorithm;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import controller.Main;
import controller.Person;

/**
 * Calculate
 * Grundidee ist es das Durchschnittsalter einer jeden Liste zu berechnen.
 * 
 * @author Raffael Haberland (raffael@haberland.it)
 * @version 1.0_u
 */
public class Calculate {

	
	public static int calculateAge(String datumString) {
		/*
		 * Wandelt den String in ein Datum um,
		 * berechnet die Differenz zum heutigen Tag
		 * gibt die Differenz in Jahren zurück
		 */
		 
		//nimm das aktuelle Datum
	        
	    //berechne die Differenz
	       
	    //Wandle von ms in Jahre um
	        
	    //Gibt Alter als Ganzezahl zurück
	        return 0;
	}
	
	public static void getDurchschnittsalterderListe(Person person) {
		/*
		 * Berechnung des Durchschnittsalter
		 */

		//Erstelle ein String[] für die spätere Konsolenausgabe
		String[] ausgabe = new String[person.getFriendList().size()];
		//temporeres Gesamtalter dieser Liste
		int gesamtalter = 0;
		//itteriere über alle Personen der Liste
		for (int i = 0; i < person.getFriendList().size(); i++) {
			//erstelle den String zum abspeichern
			ausgabe[i] = "TODO Person aus der Freundesliste"+" "+calculateAge("TODO Geburtstag des Freundes")+" Jahre";
			//Addiere das Gesamtalter auf
			gesamtalter = gesamtalter +calculateAge("TODO Geburtstag des Freundes");
		}
		//Gib das Gesamtalter aus
		System.out.println("Durchschnittsalter der Freunde "+"TODO Name der Person"+": "+"TODO Durchschnittalter"+" Jahre");
		//Speichere die Listen mit der Altersangabe einer jeden Liste
		io.Write.saveAsFile("output//Freunde mit Alter von "+"TODO Name der Person"+".txt", ausgabe);
	}
}
