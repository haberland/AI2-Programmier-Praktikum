package graphen;

import java.util.ArrayList;
import java.util.List;

import javax.swing.DebugGraphics;

import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.SingleGraph;

import controller.Main;
import controller.Person;

/** 
 * Klasse Paint
 * Grundidee einen Graphen zu visualisieren.
 * 
 * Erstellt einen Graphen und fügt Kanten wie Kanten dem Graphen hinzu.
 *
 * @author Raffael Haberland (raffael@haberland.it)
 * @version 1.3_u
 */
public class Paint {
	
	public static void graphenErstellen(List<Person> adressbuch) {
		/*
		 * Initialen Graphen erstellen und die "Hauptpersonen" (die CSV Dateinamen) dem Nezuwerk hinzufügen.
		 * Überprüft ob die Knoten schon vorhanden, wenn nicht werden diese hinzugefügt. 
		 */
		
		//Erstellet einen Graphen mit dem Namen Netzwerk
		
		//Ausgangspunkre rot machen und Namen fetten 
		graph.addAttribute("ui.stylesheet", "node.marked {fill-color: red; text-style: bold;}");
		//Schleife ueber alle eingelesenen CSV-Dateien (Aufgebe 2.2)
		for (int i = 0; i < adressbuch.size(); i++) {
			//Ist die Hauptperson um die ein Netz aufebeut wird, schon im Graphen vorhanden?
			
				//Wenn nicht, dann füge diese dem Gaphen hinzu
				
			}
			//Erstelle eine Freundesliste
			
			//wähle die Freundesliste der Person i aus der Liste der CSV-Dateien
			
			//Itterier über die Freundesliste der Person i und füge gegebenenfalls hinzu
			for (int f = 0; f < friends.size(); f++) {
				
			}
		}
		//zeichne den Graphen
//		graph.display(true);
	}

}
