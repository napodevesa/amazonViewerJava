package com.ndev.amazonviewer.model;

public class Serie {
	
	int id;
	private String title;
	private String genre;
	private String creator;
	private int duration;
	private short year;
	private boolean viewed;
	private int timeViewed;

	
	public Serie(String title, String genre, int duration) {
		super();
		this.title = title;
		this.genre = genre;
		this.duration = duration;
	}
	
	//private int sessionQuantity;
	
	
	
	

}
