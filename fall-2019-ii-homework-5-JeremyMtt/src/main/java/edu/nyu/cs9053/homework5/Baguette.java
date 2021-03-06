package edu.nyu.cs9053.homework5;

public class Baguette implements Recipe{
    
    private double cooktime;
    
    private final int foodVolume;
    
    private final Oven oven;
    
    private double RemainingTime;
    
    private int RemainingVolume;
    
    private  double exponentialRate;
    
    private final Timer timer = new Timer() {
	    public void update(Time unit, int value, int ovenTemperature) {
		adjust(unit, value, ovenTemperature);
	    }
	};
    
    public Baguette(Oven oven) {
	this.oven = oven;
	this.initializeFromOven(oven);
	this.foodVolume = 2000;
	this.exponentialRate = 0.5d;
    }
    
    @Override
	public void initializeFromOven(Oven oven) {
	if(oven == null) {
	    throw new IllegalArgumentException("Oven is null!");
	}
	double log = 0.01d / oven.getSetTemperature();
	this.cooktime = (double)(Math.log(log) / ((double)(- 0.5d)));
	this.RemainingTime = this.cooktime * 60;
    }

    @Override
	public int getVolumeCubicInches() {
	return this.foodVolume;
    }

    @Override
	public Double getRemainingSecondsUntilDone() {
	return this.RemainingTime;
    }

    @Override
	public void adjust(Time unit, int amount, int ovenTemperature) {
	if(unit == null) {
	    throw new IllegalArgumentException("Should have unit");
	}
	switch(unit) {
	case Seconds :
	    this.RemainingTime = (double) (this.RemainingTime - (ovenTemperature * Math.exp(-exponentialRate * amount)));
	    break;
	case Minutes :
	    this.RemainingTime = (double) (this.RemainingTime - (ovenTemperature * Math.exp(-exponentialRate * amount/60)));
	    break;
	default :
	    throw new AssertionError ("error");
	}
    }

    @Override
	public boolean isRecipeDone() {
	if(getRemainingSecondsUntilDone() <= 0) {
	    return true;
	}
	else {
	    return false;
	}
    }
    
}
