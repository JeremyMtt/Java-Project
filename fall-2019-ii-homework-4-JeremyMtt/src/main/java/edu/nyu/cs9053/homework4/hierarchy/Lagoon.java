package edu.nyu.cs9053.homework4.hierarchy;

public class Lagoon extends Lake{
    
    private double flow;

    public Lagoon(String name, double volume,double flow){
	super(name,volume);
	this.flow = flow;
    }
    
    public double getFlow(){
	return flow;
    }

    public boolean equals(Object obj){
	if(this== obj){
            return true;
	}
        if(obj == null || (getClass() != obj.getClass())) {
            return false;
	}
        Spring that = (Spring) obj;
	return (this.getName() == null ? that.getName() == null : this.getName().equals(that.getName()))
            && (this.getVolume() == that.getVolume())
            && (this.getFlow() == that.getFlow());
    }

    public int hashCode(){
	int hash = (this.getName() == null ? 0 : this.getName().hashCode());
	hash = 31 * hash + Double.valueOf(this.getVolume()).hashCode();
	hash = 31 * hash + Double.valueOf(this.getFlow()).hashCode();
	return hash;
    }

    public String describe(){
	return String.format("Name - %s %nVolume - %.2f %n Flow - %.2f",getName(),getVolume(),getFlow());
    }
}
