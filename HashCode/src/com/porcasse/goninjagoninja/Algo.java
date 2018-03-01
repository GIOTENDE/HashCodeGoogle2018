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
	
	private Integer maximumDistanceOpti = null; 
	
	/**
	 * 
	 * @param rides
	 * @param nbVehicules
	 */
	public void optimiserTrajets(List<Ride> rides, Integer nbVehicules){
		
		Integer nbRide = rides.size();
		Integer nbTrajetAOptimiser = nbRide - nbVehicules;
		
		if(nbRide > nbVehicules){
			for(int i=0; i < rides.size(); i++){
				comparerRideToList(rides.get(i),rides,i,nbTrajetAOptimiser);	
			}
		}
		
		
		
	}

	private Integer comparerRideToList(Ride currentRide,List<Ride> rides, Integer index, Integer nbTrajetsAOptimiser) {
		Integer nbDansListeOptis = 0;
		
		for(int i = 0; i<rides.size();i++){
			if(i != index){
				Integer distance = Utils.calculerDistanceVecteur(currentRide.getEnd(), rides.get(i).getStart());
				if(ridesLesPlusOptis.size() < nbTrajetsAOptimiser){
//					currentRide.setLocked(Boolean.TRUE);
//					rides.get(i).setLocked(Boolean.TRUE);
					ridesLesPlusOptis.add(new PairRide(currentRide, rides.get(i), distance));
					nbDansListeOptis++;
					if(maximumDistanceOpti == null || maximumDistanceOpti < distance){
						maximumDistanceOpti = distance;
					}
				}
				else if(maximumDistanceOpti < distance){
					maximumDistanceOpti = distance;
//					currentRide.setLocked(Boolean.TRUE);
//					rides.get(i).setLocked(Boolean.TRUE);
					ridesLesPlusOptis.add(new PairRide(currentRide, rides.get(i), distance));
					nbDansListeOptis++;
				}
			}
		}
		return nbDansListeOptis;
	}
	
	List<PairRide> removeDistancePair(Integer distance){
		for(PairRide currentRide : ridesLesPlusOptis){
			if(currentRide.getDelai() == distance){
//				ridesLesPlusOptis.remove();
			}
		}
		return null;
	}
}
