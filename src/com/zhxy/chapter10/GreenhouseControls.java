package com.zhxy.chapter10;

public class GreenhouseControls extends Controller {

	private boolean light = false;
	
	public class LightOn extends Event {

		public LightOn(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			//Put handware control code here to 
			//physically turn on the light
			light = true;
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Light is on";
		}
	}
	
	public class LightOff extends Event {

		public LightOff(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			light = false;
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Light is off";
		}
	}
	
	private boolean water = false;
	public class WaterOn extends Event {

		public WaterOn(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			// TODO Auto-generated method stub
			water = true;
		}
		public String toString() {
			return "Greenhouse water is on";
		}
		
	}
	public class Wateroff extends Event {

		public Wateroff(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			water = false;
		}
		public String toString() {
			return "Greenhouse water is off";
		}
		
	}
	
	private String thermostat = "Day";
	public class ThermostatNight extends Event {

		public ThermostatNight(long delayTime) {
			super(delayTime);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void action() {
			// TODO Auto-generated method stub
			thermostat = "Night";
		}
		
		public String toString() {
			return "Thermostat night setting";
		}
		
	}
	
	public class ThermostatDay extends Event {

		public ThermostatDay(long delayTime) {
			super(delayTime);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void action() {
			// TODO Auto-generated method stub
			thermostat = "Day";
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Thermostat on day setting";
		}
	}

	private boolean fan = true;
	public class FanOn extends Event {

		public FanOn(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			fan = true;
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Fan is on";
		}
		
	}
	
	public class FanOff extends Event {

		public FanOff(long delayTime) {
			super(delayTime);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void action() {
			// TODO Auto-generated method stub
			fan = false;
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Fan is off";
		}
		
	}
	
	public class Bell extends Event {

		public Bell(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			addEvent(new Bell(delayTime));
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Bing!";
		}
		
	}
	
	public class Restart extends Event {

		private Event[] eventList;
		
		
		public Restart(long delayTime,Event[] eventList) {
			super(delayTime);
			this.eventList = eventList;
			for(Event e:eventList) {
				addEvent(e);
			}
		}

		@Override
		public void action() {
			// TODO Auto-generated method stub
			for(Event e:eventList) {
				e.start();
				addEvent(e);
			}
			start();
			addEvent(this);
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Restarting system";
		}
	}
	
	public static class Terminate extends Event {

		public Terminate(long delayTime) {
			super(delayTime);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void action() {
			// TODO Auto-generated method stub
			System.exit(0);
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Terminating";
		}
	
	}
	
}
