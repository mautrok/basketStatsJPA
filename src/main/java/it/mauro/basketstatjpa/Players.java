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
	String nome;
	int numero;
	public PlayersPK getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setId(PlayersPK id) {
		this.id = id;
	}
	
	
}
