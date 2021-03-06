package edu.nyu.cs9053.homework4.hierarchy;

public class SaltWater extends BodyOfWater{

    private int connectnumber;

    public SaltWater(String name, double volume, int connectnumber){
        super(name,volume);
        this.connectnumber = connectnumber;
    }
    public int getConnectedWaterBodiesCount(){
        return connectnumber;
    }

    public boolean equals(Object obj){
	if(this== obj){
            return true;
	}
	if(obj == null || (getClass() != obj.getClass())) {
            return false;
        }
	SaltWater that = (SaltWater) obj;
	return (this.getName() == null ? that.getName() == null : this.getName().equals(that.getName()))
            && (this.getVolume() == that.getVolume())
            && (this.getConnectedWaterBodiesCount() == that.getConnectedWaterBodiesCount());
    }

    public int hashCode(){
	int hash = (this.getName() == null ? 0 : this.getName().hashCode());
        hash = 31 * hash + Double.valueOf(this.getVolume()).hashCode();
        hash = 31 * hash + Integer.valueOf(this.getConnectedWaterBodiesCount()).hashCode();
	return hash;
    }
    public String describe(){
        return String.format("Name - %s %nVolume - %.2f %n connectedWaterBodies - %d",getName(),getVolume(),getConnectedWaterBodiesCount());
    }
}
