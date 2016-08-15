package com.zhxy.chapter14;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.zhxy.chapter10.Factories;
import com.zhxy.chapter14.factory.Factory;

class Part {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName();
	}

	static List<Factory<? extends Part>> partFactories = new ArrayList<>();

	static {
		partFactories.add(new FuelFilter.Factory());
		partFactories.add(new AirFilter.Factory());
		partFactories.add(new CabinFilter.Factory());
		partFactories.add(new OilFilter.Factory());
		partFactories.add(new FanBelt.Factory());
		partFactories.add(new PowerSteeringBelt.Factory());
		partFactories.add(new GeneratorBelt.Factory());

	}

	private static Random rand = new Random(47);

	public static Part createRandom() {
		int n = rand.nextInt(partFactories.size());
		return partFactories.get(n).create();
	}
	
	//P14
	static List<Class<? extends Part>> typeList = new ArrayList<>();
	static {
		typeList.add(FuelFilter.class);
		typeList.add(AirFilter.class);
		typeList.add(CabinFilter.class);
		typeList.add(OilFilter.class);
		typeList.add(FanBelt.class);
		typeList.add(GeneratorBelt.class);
		typeList.add(PowerSteeringBelt.class);
	}
	
	public static Part createRandomByClass() throws InstantiationException, IllegalAccessException{
		int n = rand.nextInt(typeList.size());
		return typeList.get(n).newInstance();
	}
}

class Filter extends Part {
}

class FuelFilter extends Filter {
	public static class Factory implements com.zhxy.chapter14.factory.Factory<FuelFilter> {
		@Override
		public FuelFilter create() {
			// TODO Auto-generated method stub
			return new FuelFilter();
		}
	}
}

class AirFilter extends Filter {
	public static class Factory implements com.zhxy.chapter14.factory.Factory<AirFilter> {
		@Override
		public AirFilter create() {
			// TODO Auto-generated method stub
			return new AirFilter();
		}
	}
}

class CabinFilter extends Filter {
	public static class Factory implements com.zhxy.chapter14.factory.Factory<CabinFilter> {
		@Override
		public CabinFilter create() {
			// TODO Auto-generated method stub
			return new CabinFilter();
		}
	}
}

class OilFilter extends Filter {
	public static class Factory implements com.zhxy.chapter14.factory.Factory<OilFilter> {
		@Override
		public OilFilter create() {
			// TODO Auto-generated method stub
			return new OilFilter();
		}
	}
}

class Belt extends Part {
}

class FanBelt extends Belt {
	public static class Factory implements com.zhxy.chapter14.factory.Factory<FanBelt> {
		@Override
		public FanBelt create() {
			// TODO Auto-generated method stub
			return new FanBelt();
		}
	}
}

class GeneratorBelt extends Belt {
	public static class Factory implements com.zhxy.chapter14.factory.Factory<GeneratorBelt> {
		@Override
		public GeneratorBelt create() {
			// TODO Auto-generated method stub
			return new GeneratorBelt();
		}
	}
}

class PowerSteeringBelt extends Belt {
	public static class Factory implements com.zhxy.chapter14.factory.Factory<PowerSteeringBelt> {
		@Override
		public PowerSteeringBelt create() {
			// TODO Auto-generated method stub
			return new PowerSteeringBelt();
		}
	}
}

public class RegisteredFactories {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		for (int i = 0; i < 10; i++) {
			System.out.println(Part.createRandom());
		}
		System.out.println("==========");
		for (int i = 0; i < 10; i++) {
			System.out.println(Part.createRandomByClass());
		}
	}
}
