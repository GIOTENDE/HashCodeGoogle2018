package com.porcasse.goninjagoninja;

import com.porcasse.kowabunga.Ride;

public class PairRide {
	
	public PairRide(Ride ride1, Ride ride2, Integer delai){
		this.ride1 = ride1;
		this.ride2 = ride2;
		this.delai = delai;
	}
	
	private Ride ride1;
	
	private Ride ride2;
	
	private Integer delai;

	public Ride getRide1() {
		return ride1;
	}

	public void setRide1(Ride ride1) {
		this.ride1 = ride1;
	}

	public Ride getRide2() {
		return ride2;
	}

	public void setRide2(Ride ride2) {
		this.ride2 = ride2;
	}

	public Integer getDelai() {
		return delai;
	}

	public void setDelai(Integer delai) {
		this.delai = delai;
	}
	
	

}
