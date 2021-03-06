package edu.nyu.cs9053.homework4.hierarchy;

public class Tarn extends Lake{
    
    private final int variable;
    
    public Tarn(String name, double volume, int variable){
        super(name,volume);
	this.variable = variable;
    }

    public boolean equals(Object obj){
	if(this== obj){
            return true;
	}
        if(obj == null || (getClass() != obj.getClass())) {
            return false;
	}
        Tarn that = (Tarn) obj;
	return (this.getName() == null ? that.getName() == null : this.getName().equals(that.getName()))
            && (this.getVolume() == that.getVolume())
      	    && (variable == that.variable);
    }

    public int hashCode(){
	int hash = (this.getName() == null ? 0 : this.getName().hashCode());
	hash = 31 * hash + Double.valueOf(this.getVolume()).hashCode();
	hash = 31 * hash + Integer.valueOf(variable).hashCode();
	return hash;
    }
    public String describe(){
        return String.format("Name - %s %nVolume - %.2f %n",getName(),getVolume());
    }
}