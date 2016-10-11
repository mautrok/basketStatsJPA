package it.mauro.basketstatjpa;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="history", schema="basketstats")
@NamedQuery(name="History.findAll", query="SELECT h FROM History h")
public class History implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private HistoryPK id;
	private int point;
	private int twopoint;
	private int threepoint;
	private int defreb;
	private int offreb;
	private int assist;
	private int ballsteal;
	private int ballloose;
	private int block;
	private int fouls;
	
	@EmbeddedId
	public HistoryPK getId() {
		return id;
	}
	public void setId(HistoryPK id) {
		this.id = id;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public int getTwopoint() {
		return twopoint;
	}
	public void setTwopoint(int twopoint) {
		this.twopoint = twopoint;
	}
	public int getThreepoint() {
		return threepoint;
	}
	public void setThreepoint(int threepoint) {
		this.threepoint = threepoint;
	}
	public int getDefreb() {
		return defreb;
	}
	public void setDefreb(int defreb) {
		this.defreb = defreb;
	}
	public int getOffreb() {
		return offreb;
	}
	public void setOffreb(int offreb) {
		this.offreb = offreb;
	}
	public int getAssist() {
		return assist;
	}
	public void setAssist(int assist) {
		this.assist = assist;
	}
	public int getBallsteal() {
		return ballsteal;
	}
	public void setBallsteal(int ballsteal) {
		this.ballsteal = ballsteal;
	}
	public int getBallloose() {
		return ballloose;
	}
	public void setBallloose(int ballloose) {
		this.ballloose = ballloose;
	}
	public int getBlock() {
		return block;
	}
	public void setBlock(int block) {
		this.block = block;
	}
	public int getFouls() {
		return fouls;
	}
	public void setFouls(int fouls) {
		this.fouls = fouls;
	}
	
	
}
