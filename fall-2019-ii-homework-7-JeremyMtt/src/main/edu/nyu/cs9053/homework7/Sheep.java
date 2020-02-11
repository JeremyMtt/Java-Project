package edu.nyu.cs9053.homework7;

public class Sheep implements Animal{

    private final String name;
    
    public Sheep(String name) {
	this.name = name;
    }
    
    @Override
	public String getName() {
	return name;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ( (obj == null) || (getClass() != obj.getClass()) ) {
            return false;
        }
        Sheep animal = (Sheep) obj;
        if (getName() != animal.getName()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hash = (this.getName() == null ? 0 : this.getName().hashCode());
        return hash;
    }
}
