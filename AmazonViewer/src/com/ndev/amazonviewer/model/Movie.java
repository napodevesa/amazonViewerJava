package com.ndev.amazonviewer.model;

public class Movie extends Film {

	private int id;
	private int timeViewed;
	

	public Movie(String title, String genre, String creator, int duration, short year) {
		super(title, genre, creator, duration);
		setYear (year);
	}

	public void showDate () {
		
		//System.out.println ("Title: " + this.title);
		//System.out.println ("Género: " + this.genre);
		//System.out.println ("Año: " + this.year);
	}
	
	public int getId() {
		return id;
	}

	public int getTimeViewed() {
		return timeViewed;
	}

	public void setTimeViewed(int timeViewed) {
		this.timeViewed = timeViewed;
	}
	

}
