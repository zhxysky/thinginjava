package com.zhxy.chapter10;

public class GreenhouseController2 {

	public static void main(String[] args) {
		GreenhouseControls2 gc = new GreenhouseControls2();
		gc.addEvent(gc.new Bell(900));
		Event[] eventList = {
				gc.new ThermostatNight(0),
				gc.new LightOn(200),
				gc.new LightOff(400),
				gc.new WaterOn(600),
				gc.new Wateroff(800),
				gc.new FanOn(1000),
				gc.new FanOff(1200),
				gc.new WaterJetMachineOn(1400),
				gc.new WaterJetMachineOff(1600),
				gc.new ThermostatDay(1800)
		};	
		gc.addEvent(gc.new Restart(2000, eventList));
		gc.run();
	}
}
