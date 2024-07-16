package coreJavaByRahulShetty;

public class TrafficInterface implements AustrlianLight, ChinaRoadLight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AustrlianLight d = new TrafficInterface();
		TrafficInterface d1 = new TrafficInterface();
		ChinaRoadLight d2 = new TrafficInterface();

		d.GreenLight();
		d.RedLight();
		d.Yellowight();
		d1.Rules();
		d2.NewRule();

	}

	@Override
	public void GreenLight() {
		// TODO Auto-generated method stub
		System.out.println("hello green");
	}

	@Override
	public void RedLight() {
		// TODO Auto-generated method stub
		System.out.println("hello red");
	}

	public void Rules() {
		System.out.println("obey the rule");
	}

	@Override
	public void Yellowight() {
		// TODO Auto-generated method stub
		System.out.println("hello yellow");
	}

	@Override
	public void NewRule() {
		// TODO Auto-generated method stub
		System.out.println("go speed");
	}

}
