package com.porcasse.goninjagoninja;

public class Utils {
	
	/**
	 * Retourne le nombre de d�placements � r�aliser entre la position A et la position B.
	 * @param A
	 * @param B
	 */
	public static Integer calculerDistanceVecteur(Coordonnees A, Coordonnees B){
		return (A.getX() - B.getX()) + (A.getY() - B.getY());
	}
	
}
