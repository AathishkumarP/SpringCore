package com.spring.springCore;

public class FighterPlane extends Plane {
	
	private String engine;
	private int speed;

	public FighterPlane(String engine, int speed) {
		super();
		this.engine = engine;
		this.speed = speed;
	}
	public FighterPlane() {
		this.engine = engine;
		this.speed = speed;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "FighterPlane [engine=" + engine + ", speed=" + speed + "]";
	}

	void takeoff()
	{
		System.out.println("FighterPlane is TakingOff");	
	}
	
	void fly()
	{
		System.out.println("FighterPlane is Flying");
	}

	void land()
	{
		System.out.println("FighterPlane is Landing");
	}
}
