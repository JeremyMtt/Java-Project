package edu.nyu.cs9053.homework4.hierarchy;

public class Ocean extends SaltWater{

    private double flow;

    private String variable;
    
    public Ocean(String name, double volume, int connectnumber,double flow){
	super(name,volume,connectnumber);
	this.flow = flow;
    }

    public double getFlow(){
	return flow;
    }
    
    public boolean equals(Object obj){
	if(this == obj){
	    return true;
	}
	if(obj == null || (getClass() != obj.getClass())) {
	    return false;
	}
	Ocean that = (Ocean) obj;
	return (this.getName() == null ? that.getName() == null : this.getName().equals(that.getName()))
	    && (this.getVolume() == that.getVolume())
	    && (this.getConnectedWaterBodiesCount() == that.getConnectedWaterBodiesCount())
	    && (this.getFlow() == that.getFlow());
    }
    
    public int hashCode(){
	int hash = (this.getName() == null ? 0 : this.getName().hashCode());
	hash = 31 * hash + Double.valueOf(this.getVolume()).hashCode();
	hash = 31 * hash + Integer.valueOf(this.getConnectedWaterBodiesCount()).hashCode();
	hash = 31 * hash + Double.valueOf(this.getFlow()).hashCode();
	return hash;
    }

    public String describe(){
	return String.format("Name - %s %nVolume - %.2f %n connectedWaterBodies - %d %n Flow - %.2f",getName(),getVolume(),getConnectedWaterBodiesCount());
    }
}