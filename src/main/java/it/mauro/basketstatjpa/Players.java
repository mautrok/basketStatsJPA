package it.mauro.basketstatjpa;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="players", schema="basketstats")
@NamedQuery(name="Players.findAll", query="SELECT p FROM Players p")
public class Players implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private PlayersPK id;
	int number;
	public PlayersPK getId() {
		return id;
	}
	
	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public void setId(PlayersPK id) {
		this.id = id;
	}
	
	
}
