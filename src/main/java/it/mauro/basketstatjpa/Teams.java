package it.mauro.basketstatjpa;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="teams", schema="basketstats")
@NamedQuery(name="Teams.findAll", query="SELECT t FROM Teams t")
public class Teams implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String team;

	@Id
	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
	
}
