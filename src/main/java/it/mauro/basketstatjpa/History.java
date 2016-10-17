package it.mauro.basketstatjpa;

import java.io.Serializable;
import java.util.Date;

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
	private int number;
	private int point;
	private float twopoint;
	private float threepoint;
	private int defreb;
	private int offreb;
	private int assist;
	private int ballsteal;
	private int ballloose;
	private int block;
	private int foul;
	private Date date;
	
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
	public float getTwopoint() {
		return twopoint;
	}
	public void setTwopoint(float twopoint) {
		this.twopoint = twopoint;
	}
	public float getThreepoint() {
		return threepoint;
	}
	public void setThreepoint(float threepoint) {
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
	public int getFoul() {
		return foul;
	}
	public void setFoul(int foul) {
		this.foul = foul;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
