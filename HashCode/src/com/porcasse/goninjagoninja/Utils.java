package com.porcasse.goninjagoninja;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

import com.porcasse.kowabunga.Coordonnees;
import com.porcasse.kowabunga.Ride;

public class Utils {
	
	/**
	 * Retourne le nombre de déplacements à réaliser entre la position A et la position B.
	 * @param A
	 * @param B
	 */
	public static Integer calculerDistanceVecteur(Coordonnees A, Coordonnees B){
		return (A.getX() - B.getX()) + (A.getY() - B.getY());
	}
	
	public  static void creerFichierSortie(Map<Vehicule, List<Ride>> listeRideParVehicule) {
		List<String> listToReturn = new List<String>();
		for(Map.Entry<String, List<Ride>> entry : listeRideParVehicule.entrySet()) {
			String line = "";
			line += entry.getKey();
			for(Map.Entry<String, String> rides : entry.getValue()) {
				line += " ";
				line += rides.getValue().toString();
			}
			listToReturn.add(line);
		}
		Path file = Paths.get("output.txt");
		Files.write(file, listToReturn, Charset.forName("UTF-8"));
	}
	
}
