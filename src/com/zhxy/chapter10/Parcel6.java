package com.zhxy.chapter10;

public class Parcel6 {

	private void internalTracking(boolean b) {
		if(b) {
			class TrackingSlip {
				private String id;
				public TrackingSlip(String s) {
					// TODO Auto-generated constructor stub
					id = s;
				}
				String getSlip() {
					return id;
				}
			}
			TrackingSlip ts = new TrackingSlip("slip");
			String s = ts.getSlip();
			System.out.println(s);
		}
		//can't use TrackingSlip here
	}
	public void track() {
		internalTracking(true);
	}
	
	public static void main(String[] args) {
		Parcel6 p = new Parcel6();
		p.track();
	}
}
