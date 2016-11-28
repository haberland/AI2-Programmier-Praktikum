package tutor;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * CSV-Generator
 * 
 * hiermit können CSV Datensätze beliebiger Länge erstellt werden.
 * Der Generator ist nicht Teil des Projektes und wird nicht an die Studierenden ausgegeben.
 * 
 * Der Generator beötigt: 
 * - Liste mit weiblichen Vornamen
 * - Liste mit männlichen Vornamen
 * - Liste mit Nachnamen
 * - Liste mit Ortsangaben 
 * 
 * @author Raffael Haberland (raffael@haberland.it)
 * @version 0.1
 */
public class AdressGenerator {
	public static void main(String[] args) {
		//Liste mit den weiblichen Vornamen als txt-Datei (Namen untereinander)
		Path file = Paths.get("generator//vornamen_frau.txt");
		String[] women = makeToArray(file);
		
	}

	private static String[] makeToArray(Path file) {
		// TODO Auto-generated method stub
		return null;
	}

}
