package edu.nyu.cs9053.homework4.hierarchy;

public class FreshWater extends BodyOfWater{

    public FreshWater(String name, double volume){
        super(name,volume);
    }
    
    public boolean equals(Object obj){
	if(this== obj){
            return true;
	}
	if(obj == null || (getClass() != obj.getClass())) {
            return false;
        }
	FreshWater that = (FreshWater) obj;
	return (this.getName() == null ? that.getName() == null : this.getName().equals(that.getName()))
            && (this.getVolume() == that.getVolume());
    }

    public int hashCode(){
	int hash = (this.getName() == null ? 0 : this.getName().hashCode());
        hash = 31 * hash + Double.valueOf(this.getVolume()).hashCode();
	return hash;
    }
    public String describe(){
        return String.format("Name - %s %nVolume - %.2f %n ",getName(),getVolume());
    }
}