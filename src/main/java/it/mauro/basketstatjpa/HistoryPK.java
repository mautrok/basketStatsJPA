package it.mauro.basketstatjpa;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class HistoryPK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String team;
	String player;
	int number;
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getPlayer() {
		return player;
	}
	public void setPlayer(String player) {
		this.player = player;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	
}
