package com.zhxy.chapter9.interfaces;

import com.zhxy.chapter9.BandPass;
import com.zhxy.chapter9.Filter;
import com.zhxy.chapter9.HighPass;
import com.zhxy.chapter9.Lowpass;
import com.zhxy.chapter9.Waveform;


/**
 * 适配器设计模式
 * 适配器中的代码将接受你所拥有的接口，并产生你所需要的接口
 * @author zhangxiaoyan
 *
 */
class FilterAdapter implements Processor {

	Filter filter;
	
	
	public FilterAdapter(Filter filter) {
		this.filter = filter;
	}
	
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return filter.name();
	}

	@Override
	public Waveform process(Object input) {
		// TODO Auto-generated method stub
		return filter.process((Waveform) input);
	}
	

}

public class FilterProcessor {
	public static void main(String[] args) {
		Waveform w = new Waveform();
		Apply.process(new FilterAdapter(new Lowpass(1.0)), w);
		Apply.process(new FilterAdapter(new HighPass(2.0)), w);
		Apply.process(new FilterAdapter(new BandPass(3.0,4.0)), w);
	}
}