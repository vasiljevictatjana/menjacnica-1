package menjacnica.sistemskeoperacije;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.LinkedList;

import menjacnica.Valuta;

public class SOUcitajIzFajla {

	
	public static void ucitajIzFajla(String putanja, LinkedList<Valuta> kursnaLista) {
		try{
			ObjectInputStream in = new ObjectInputStream(
					new BufferedInputStream(new FileInputStream(putanja)));
			
			LinkedList<Valuta> kursnaLista2 = (LinkedList<Valuta>)(in.readObject());
			kursnaLista.clear();
			kursnaLista.addAll(kursnaLista2);
			
			in.close();
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}
}
