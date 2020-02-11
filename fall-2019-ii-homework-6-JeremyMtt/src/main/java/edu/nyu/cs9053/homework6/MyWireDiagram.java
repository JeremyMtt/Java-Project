package edu.nyu.cs9053.homework6;

public class MyWireDiagram implements WireDiagram{
    
    private final MyTripWire mytripwire;
    
    private final TripWire tripwire;
    
    MyWireDiagram(TripWire tripwire,MyTripWire mytripwire){
	this.tripwire = tripwire;
	this.mytripwire = mytripwire;
    }
    
    public MyTripWire getMyTripWire() {
	return mytripwire;
    }

    @Override
	public TripWire getTripWires() {
	return tripwire;
    }
}