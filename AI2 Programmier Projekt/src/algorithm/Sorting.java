package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import controller.FriendList;
import controller.Main;
import controller.Person;
import io.Write;

/**
 * Sortieren
 * 
 * Hier soll die Sortierung realisiert werden
 * Grundlegende Idee ist es, dass man das Adressbuch uebergeben bekommt
 * durch diese itteriert und zum Schluss eine Sortierte Liste als Text-File abspeichert
 *
 * @author Raffael Haberland (raffael@haberland.it)
 * @author Tobias Rupp (tobiasrupp90@gmail.com)
 * @version 1.1_u
 */

public class Sorting {
	
	public static void alphabtischSortieren(List<Person> personen) {
		//Erstelle eine leere Liste in die die sortierten Freunde gelegt werden
		String[] sortierteListe = null;
		
		//Itteriere ueber die einzelnen eingelesenen CSV-Dateien
		for (int i = 0; i < personen.size(); i++) {
			
			FriendList friends = null;
			sortierteListe = new String[friends.size()];
			
			// Achtung, jeweils die richtige compareTo methode in der Klasse Person aktivieren!!
			Collections.sort(friends);
			//Nimm alle sortieren Freunde und lade die Freundeslisten der Person
			for (int f = 0; f < friends.size(); f++) {
				sortierteListe[f] = "TODO Name des Freundes" + " " + "TODO Geburtstag des Freundes";
			}
			//Übergebe dem Writer die zu scheibenden Dateien
			Write.saveAsFile("output//Liste " + "TODO Name der Person" +" alphabetisch sotiert", sortierteListe);
			System.out.println("Liste " + "TODO Name der Person" +" alphabetisch sotiert");
		}
	}

	public static void nachAlterSortieren(List<Person> personen) {
		String[] sortierteListe = null;
		for (int i = 0; i < personen.size(); i++) {
			List<Person> friends = new ArrayList<>();
			friends = null;
			sortierteListe = new String[friends.size()];
			// Achtung, jeweils die richtige compareTo methode in der Klasse Person aktivieren!!
			Collections.sort(friends);
			
			for (int f = 0; f < friends.size(); f++) {
				sortierteListe[f] = "TODO Name des Freundes" + " " + "TODO Geburtstag des Freundes"+" "+Calculate.calculateAge("TODO  Geburtstag des Freunes")+" Jahre";
			}
			Write.saveAsFile("output//Liste " + "TODO Name der Person" +" nach Alter sortiert", sortierteListe);
			if(Main.debug)
				System.out.println("Liste " + "TODO Name der Person" +" nach Alter sortiert");
		}
	}
}
