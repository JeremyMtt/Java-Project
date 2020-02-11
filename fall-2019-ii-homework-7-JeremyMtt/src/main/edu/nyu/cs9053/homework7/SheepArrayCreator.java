package edu.nyu.cs9053.homework7;

public class SheepArrayCreator implements ArrayCreator<Sheep>{

    @Override
	public Sheep[] create(int arraysize) {
	return new Sheep[arraysize];
    }

}
