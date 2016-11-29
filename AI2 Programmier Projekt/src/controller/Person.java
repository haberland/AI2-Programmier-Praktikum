package controller;
import java.util.HashMap;
import java.util.Map;

import algorithm.Calculate;

/** 
 * Klasse Person
 * Eine Person hat folgende (Grund-) Attribute:
 * - Vorname
 * - Nachname
 * - Geburtstag
 * - Geschlecht
 * 
 * zudem noch einen Wohnort und eine Freundeslist 
 *
 * @author Raffael Haberland (raffael@haberland.it)
 * @author Tobias Rupp (tobiasrupp90@gmail.com)
 * @version 1.3_u
 */


public class Person implements Comparable<Person>{
	
	/* Attribute 
	 * 
	 */

	
	
	/* Constructor 
	 * 
	 */
	public Person(String vorname, String nachname) {

	}

	
	/*	Set-Methoden fuer die einzelnen Attribute
	 * 
	 */

	
	/*	Get-Methoden fuer die einzelnen Attribute
	 * 
	 */



	

	/* Equals Methode fuer Vorname, Nachname
	 * 
	 */
	public boolean equals(Person person) {
		return false;
		}


	/* CompateTo Methode f�r den Namensvergleich
	 * 
	 */
	public int compareTo(Person person) {
		return 0;
	}
	
	
}
