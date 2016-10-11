package it.mauro.basketstatjpa;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="games", schema="basketstats")
@NamedQuery(name="Games.findAll", query="SELECT g FROM Games g")
public class Games implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String adversary;
	private boolean home;
	private GamesPK id;
	
	@EmbeddedId
	public GamesPK getId() {
		return id;
	}
	public void setId(GamesPK id) {
		this.id = id;
	}
	public String getAdversary() {
		return adversary;
	}
	public void setAdversary(String adversary) {
		this.adversary = adversary;
	}
	public boolean isHome() {
		return home;
	}
	public void setHome(boolean home) {
		this.home = home;
	}
	
	
}
