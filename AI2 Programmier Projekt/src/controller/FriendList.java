package controller;

import java.util.ArrayList;

/** 
 * Klasse FreundesListe
 * Grundidee, erweitern einer ArrayList:
 * 
 * Jede FreundesListe soll ein Attribut vom Typ Person aufweisen, in dem der Halter der Liste verzeichnet wird.
 * Dieser Halter wird im Construktor uebergeben und ueber eine einfache get-Methode ausgelesen.
 * Eine zusaetzliche Methode um zu ueberpruefen ob eine gewissen Person schon in der Liste ist.
 * 
 * @author Tobias Rupp (tobiasrupp90@gmail.com)
 * @version 1.3_u
 */
import java.util.Iterator;

public class FriendList extends ArrayList<Person> {

	/* Attribute
	 * 
	 */
	private Person besitzer;

	/* Construktor
	 * 
	 */
	public FriendList(Person besitzer){
		this.besitzer = besitzer;
		}
	
	/* Get-Methode um den Halter/Besitzer der FreundesListe zu bekommen
	 * 
	 */
	public Person getBesitzer(){ return this.besitzer;}
	
	/* hasFriend Methode 
	 * ueberprueft ob das uebergebene Objekt in der Friendlist vorhanden ist
	 */
	public boolean hasFriend(Person person){
		boolean state = false;
		for(Iterator<Person> it = iterator(); it.hasNext();){
			
		}
		return state;
	}

}
