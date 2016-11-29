package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import algorithm.Calculate;
import algorithm.Sorting;
import graph.Paint;
import io.Read;

/**
 * AI2 Programierprojekt
 * 
 * einen sehr kleinen fiktiven Auszug aus einem Sozialen Netzwerk (wie zum Beispiel Facebook) erst einzulesen, 
 * dann zu analysieren und zum Schluss die Verbindungen unter den Personen darzustellen. 
 * Sie lesen mehrere fiktive Datensätze in Form von CSV Dateien ein, welche beispielsweise von einem Crawler gesammelt wurde.
 *
 * @author Raffael Haberland (raffael.haberland@stud.tu-darmstadt.de)
 * @version 1.3_u
 */

public class Main {

	public static void main(String[] args) {
		/*
		 * Diese Methode startet Ihr Projekt, 
		 * Speichern Sie die Pfade zu den Datensaetzen in Strings.
		 * Erstellen Sie die Personen ueber den Aufruf der Datensaetze.
		 * Fuegen Sie alle Personen, stellvertretend für jeden Datensatz in in eine Liste.
		 * Rufen Sie die Methode zur Kalkulation des Durchschnittalter auf.
		 * Rufen Sie die Methode zur alphabetischen Sortierung auf.
		 * Rufen Sie die Methode zur Sortierung nach dem Alter auf
		 * Rufen Sie die Methode zur Erstellung des Graphen auf.
		 */
		
		//Pfad der CSV Dateien
		String csv1 = null;
				
		//Einlesen der CSV Dateien
		Person person1 = null;
					
		//Erstellen einer Liste der Personen
		List<Person> personList = null;
				
		//Durschnittsalter aller Datensätze berechnen
		for (int i = 0; i < personList.size(); i++){
			
		}

		// einzelne Adressbücher alphabetisch sortieren und als Textfile 
//		Collections.sort(null);
				
//		Sorting.alphabtischSortieren(null);
//		Sorting.nachAlterSortieren(null);
				
		//Graphen erstellen (Aufgabe 2.1 und 2.1)
//		Paint.graphenErstellen(null);

	}

}
