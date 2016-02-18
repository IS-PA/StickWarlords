package com.github.ispa.stickwarlords.logic.units;

public abstract class Unit {
	
	protected int lifePoints;
	protected int xp;
	protected int baseAttack;
	protected int baseDefense;
	
	public Unit(int lifePoints, int xp, int baseAttack, int baseDefense) {
		this.lifePoints = lifePoints;
		this.xp = xp;
		this.baseAttack = baseAttack;
		this.baseDefense = baseDefense;
	}
	
	public int getLifePoints() {
		return this.lifePoints;
	}
	
	public int getXp() {
		return this.xp;
	}
	
	public int getBaseAttack() {
		return this.baseAttack;
	}
	
	public int getBaseDefense() {
		return this.baseDefense;
	}
	
	public boolean isDead() {
		return ( getLifePoints() <= 0 );
	}
	
	public void decreaseLifePoints(int amount) {
		this.lifePoints -= amount;
	}
	
	public void increaseLifePoints(int amount) {
		this.lifePoints += amount;
	}
	
	public int getLevel() {
		return (int)Math.sqrt(getXp());
	}
	
	public abstract int getAttack();
	public abstract int getDefense();
	
	public abstract void inflictDamage(int amount);
}
