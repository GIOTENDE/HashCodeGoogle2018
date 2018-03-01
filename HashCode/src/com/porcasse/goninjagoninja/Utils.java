package com.porcasse.goninjagoninja;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
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
	
	public  static void creerFichierSortie(Map<Integer, List<Ride>> listeRideParVehicule) {
		List<String> listToReturn = new ArrayList<>();
		for(Map.Entry<Integer, List<Ride>> entry : listeRideParVehicule.entrySet()) {
			String line = "";
			line += entry.getKey();
			for(Ride ride : entry.getValue()) {
				line += " ";
				line += String.valueOf(ride.getId());
			}
			listToReturn.add(line);
		}
		Path file = Paths.get("output.txt");
		try {
			Files.write(file, listToReturn, Charset.forName("UTF-8"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
