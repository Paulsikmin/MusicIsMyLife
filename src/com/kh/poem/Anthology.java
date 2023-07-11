package com.kh.poem;

public class Anthology {
	String author;
	String content;
	String season;
	String weather;
	String emotion;
	
	public Anthology() {
		super();
	}
	
	public Anthology(String author, String content) {
		super();
		this.author = author;
		this.content = content;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}
	
	
}
