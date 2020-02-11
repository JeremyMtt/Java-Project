package edu.nyu.cs9053.homework9;

public class CoffeeWithMilk implements CoffeeDrink{
    
    private final boolean isDecaf = true;
    private final boolean iscontainsMilk = true;
    
    @Override
	public boolean isDecaf() {
	return isDecaf;
    }

    @Override
	public boolean containsMilk() {
	return iscontainsMilk;
    }
}
