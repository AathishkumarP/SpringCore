package com.spring.springCore;

public class PassengerPlane extends Plane{
	
	private String engine;
	private int speed;
	
	public PassengerPlane()
	{
		this.engine=engine;
		this.speed=speed;
	}
	
	public PassengerPlane(String engine, int speed) {
		super();
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
		return "PassengerPlane [engine=" + engine + ", speed=" + speed + "]";
	}

	void takeoff()
	{
		System.out.println("PassengerPlane is TakingOff");	
	}
	
	void fly()
	{
		System.out.println("PassengerPlane is Flying");
	}

	void land()
	{
		System.out.println("PassengerPlane is Landing");
	}
}
