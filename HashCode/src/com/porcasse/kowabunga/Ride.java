package com.porcasse.kowabunga;

public class Ride {
	private Coordonnees start;
	private Coordonnees end;
	private int startTime;
	private int finishTime;
	public Coordonnees getStart() {
		return start;
	}
	public void setStart(Coordonnees start) {
		this.start = start;
	}
	public Coordonnees getEnd() {
		return end;
	}
	public void setEnd(Coordonnees end) {
		this.end = end;
	}
	public int getStartTime() {
		return startTime;
	}
	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}
	public int getFinishTime() {
		return finishTime;
	}
	public void setFinishTime(int finishTime) {
		this.finishTime = finishTime;
	}

}
