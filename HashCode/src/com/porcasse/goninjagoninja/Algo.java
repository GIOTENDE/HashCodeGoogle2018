package com.porcasse.goninjagoninja;

import java.util.List;

import com.porcasse.kowabunga.Ride;

/**
 * 
 * @author btrinta
 *
 */
public class Algo {
	
	private List<PairRide> ridesLesPlusOptis;
	
	private Integer maximumDistanceOpti = Integer.MAX_VALUE; 
	
	/**
	 * 
	 * @param rides
	 * @param nbVehicules
	 */
	public void optimiserTrajets(List<Ride> rides, Integer nbVehicules){
		
		Integer nbRide = rides.size();
		Integer nbTrajetAOptimiser = nbRide - nbVehicules;
		
		Integer index = 0;
		if(nbRide > nbVehicules){
//			if(ridesLesPlusOptis.size() < nbTrajetAOptimiser){
				index += comparerRideToList(rides.get(index),rides,index,nbTrajetAOptimiser);
//			}
		}
	}

	private Integer comparerRideToList(Ride currentRide,List<Ride> rides, Integer index, Integer nbTrajetsAOptimiser) {
		Integer nbRidesOpti = 0;
		Integer nbDansListeOptis = 0;
		
		for(int i = 0; i<rides.size();i++){
			if(i != index){
				Integer distance = Utils.calculerDistanceVecteur(currentRide.getEnd(), rides.get(i).getStart());
				if(ridesLesPlusOptis.size() < nbTrajetsAOptimiser){
					ridesLesPlusOptis.add(new PairRide(currentRide, rides.get(i), distance));
					if(maximumDistanceOpti < distance){
						maximumDistanceOpti = distance;
					}
				}
				else if(distance < maximumDistanceOpti){
					maximumDistanceOpti = distance;
				}
			}
		}
		return nbRidesOpti;
	}
}
