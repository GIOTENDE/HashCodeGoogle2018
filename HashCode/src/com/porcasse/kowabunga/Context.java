package com.porcasse.kowabunga;

import java.util.List;

public class Context {
	// 3 rows, 4 columns, 2 vehicles, 3 rides, 2 bonus and 10 steps

	private int rows;

	private int columens;

	private int vehicles;

	private int bonus;

	private int rideCount;

	private List<Ride> rides;

	public int getRidecuont() {
		return rideCount;
	}

	public void setRidecount(int rides) {
		this.rideCount = rides;
	}

	public List<Ride> getRides() {
		return rides;
	}

	public void setRides(List<Ride> rides) {
		this.rides = rides;
	}

	private int steps;

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumens() {
		return columens;
	}

	public void setColumens(int columens) {
		this.columens = columens;
	}

	public int getVehicles() {
		return vehicles;
	}

	public void setVehicles(int vehicles) {
		this.vehicles = vehicles;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public int getSteps() {
		return steps;
	}

	public void setSteps(int steps) {
		this.steps = steps;
	}

}
