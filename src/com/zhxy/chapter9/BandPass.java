package com.zhxy.chapter9;

public class BandPass extends Filter {

	double lowCutoff,highoff;
	
	public BandPass(double lowCutoff, double highoff) {
		this.lowCutoff = lowCutoff;
		this.highoff = highoff;
	}
	
	public Waveform process(Waveform input) {
		return input;
	}
}
