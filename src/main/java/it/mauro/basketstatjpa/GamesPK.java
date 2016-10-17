package it.mauro.basketstatjpa;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;

@Embeddable
public class GamesPK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String team;
	Date date;
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
