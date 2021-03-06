package edu.nyu.cs9053.homework4.hierarchy;

public abstract class BodyOfWater{

    public String name;

    public double volume;
    
    public BodyOfWater(String name, double volume){
	this.name = name;
        this.volume = volume;
    }

    public String getName(){
	return name;
    }

    public double getVolume(){
	return volume;
    }
}