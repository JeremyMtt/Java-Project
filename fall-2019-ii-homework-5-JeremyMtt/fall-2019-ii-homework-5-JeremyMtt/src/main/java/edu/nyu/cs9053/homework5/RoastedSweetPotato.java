package edu.nyu.cs9053.homework5;

public class RoastedSweetPotato implements Recipe {

    private double cooktime;
    
    private final int foodVolume;
    
    private final Oven oven;
    
    private double RemainingTime;
    
    private int RemainingVolume;
    
    private final Timer timer = new Timer() {
	    public void update(Time unit, int value, int ovenTemperature) {
		adjust(unit, value, ovenTemperature);
	    }
	};
    
    public RoastedSweetPotato(Oven oven) {
	this.oven = oven;
	this.initializeFromOven(oven);
	this.foodVolume = 6000;
    }
    
    @Override
	public void initializeFromOven(Oven oven) {
	if(oven == null) {
	    throw new IllegalArgumentException("Oven is null!");
	}
	this.cooktime = (double)(oven.getSetTemperature())/10;
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
	    RemainingTime = (double) (RemainingTime - (ovenTemperature * amount) / oven.getSetTemperature());
	    break;
	case Minutes :
	    RemainingTime = (double) ((RemainingTime - (ovenTemperature * amount) / oven.getSetTemperature())/60);
	    break;
	default :
	    throw new AssertionError ("error");
	}
    }

    @Override
	public boolean isRecipeDone() {
	if(getRemainingSecondsUntilDone() <=0) {
	    return true;
	}
	else {
	    return false;
	}
    }
    
}
