package com.porcasse.kowabunga;

public class Ride {
	private Coordonnees start;
	private Coordonnees end;
	private int startTime;
	private int finishTime;
	private Boolean locked;
	
	public Boolean getLocked() {
		return locked;
	}
	public void setLocked(Boolean locked) {
		this.locked = locked;
	}
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	
	public void releaseLock(){
		this.locked = false;
	}

}
