package edu.nyu.cs9053.homework7;

public class Barn<T extends Animal> extends Repository<T> {
    
    public Barn(ArrayCreator<? extends T> arraycreator, int arraysize) {
	super(arraycreator,arraysize);
    }
}
