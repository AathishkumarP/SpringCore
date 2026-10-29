package com.spring.springCore;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("cp")
public class CargoPlane extends Plane {
	
	@Value("CargoEngine")
	private String engine;
	
	@Value("1800")
	private int speed;
	
	public CargoPlane()
	{
		this.engine = engine;
		this.speed = speed;
	}
	
	public CargoPlane(String engine, int speed) {
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
		return "CargoPlane [engine=" + engine + ", speed=" + speed + "]";
	}

	void takeoff()
	{
		System.out.println("CargoPlane is TakingOff");	
	}
	
	void fly()
	{
		System.out.println("CargoPlane is Flying");
	}

	void land()
	{
		System.out.println("CargoPlane is Landing");
	}
}
