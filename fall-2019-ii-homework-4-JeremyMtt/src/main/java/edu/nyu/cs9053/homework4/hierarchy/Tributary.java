package edu.nyu.cs9053.homework4.hierarchy;

public class Tributary extends Stream{

    private final int variable;

    public Tributary(String name, double volume, int connectednumber, double flow, int variable){
	super(name,volume,connectednumber,flow);
	this.variable = variable;
    }

    public boolean equals(Object obj){
	if(this== obj){
            return true;
	}
        if(obj == null || (getClass() != obj.getClass())) {
            return false;
	}
        Tributary that = (Tributary) obj;
	return (this.getName() == null ? that.getName() == null : this.getName().equals(that.getName()))
            && (this.getVolume() == that.getVolume())
            && (this.getConnectedWaterBodiesCount() == that.getConnectedWaterBodiesCount())
            && (this.getFlow() == that.getFlow())
	    && (variable == that.variable);   
    }

    public int hashCode(){
	int hash = (this.getName() == null ? 0 : this.getName().hashCode());
	hash = 31 * hash + Double.valueOf(this.getVolume()).hashCode();
	hash = 31 * hash + Integer.valueOf(this.getConnectedWaterBodiesCount()).hashCode();
	hash = 31 * hash + Double.valueOf(this.getFlow()).hashCode();
	return hash;
    }

    public String describe(){
	return String.format("Name - %s %nVolume - %.2f %n connectedWaterBodies - %d %n Flow - %.2f",getName(),getVolume(),getConnectedWaterBodiesCount(),getFlow());
    }
}