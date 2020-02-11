package edu.nyu.cs9053.homework9;

public class Tea implements CoffeeDrink{
    
    private final boolean isDecaf = false;
    private final boolean iscontainsMilk = false;
    
    @Override
	public boolean isDecaf() {
	return isDecaf;
    }

    @Override
	public boolean containsMilk() {
	return iscontainsMilk;
    }
}
