package com.zhxy.chapter10;

public class GreenhouseControls2 extends GreenhouseControls {

	private boolean waterJetMachine = false;
	
	public class WaterJetMachineOn extends Event {

		public WaterJetMachineOn(long delayTime) {
			super(delayTime);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void action() {
			// TODO Auto-generated method stub
			waterJetMachine = true;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Water Jet Machine is on";
		}
		
	}
	
	public class WaterJetMachineOff extends Event {

		public WaterJetMachineOff(long delayTime) {
			super(delayTime);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void action() {
			// TODO Auto-generated method stub
			waterJetMachine = false;
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Water jet machine is off";
		}
		
	}
}
