package com.zhxy.chapter9;

public class Lowpass extends Filter {

	double cutoff;
	public Lowpass(double cutoff) {
		// TODO Auto-generated constructor stub
		this.cutoff = cutoff;
	}
	
	public Waveform process(Waveform input) {
		return input;
	}
}
