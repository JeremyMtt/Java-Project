package edu.nyu.cs9053.homework6;

import java.util.ArrayList;
import java.util.List;

public class MyBombSquadTechnician implements BombSquadTechnician{
    /**
     * steps to catch it and stop the bombs
     * 1. assess the bomb, get the right wire diagram
     * which fits the wires order. (use assess function and toolbox)
     * 2. set the NotCapture status to false
     * 3. Once cutting one bomb, we need to remove it from the list
     * then, start to assess and defuse the next one.
     */
    
    private MyBombSquadTechnician() {
    }
    
    private final static MyBombSquadTechnician mybombsquadtechnician = new MyBombSquadTechnician();
    
    public static MyBombSquadTechnician getMyBombSquadTechnician(){
	return mybombsquadtechnician;
    }
    
    @Override
	public WireDiagram assess(Bomb bomb) {
	//get my wire diagram which fits the wires
	//if red or blue, add into the trip wires
	Wire[] wires = bomb.getWires();
	List<Wire> tripwires = new ArrayList<Wire>();
	Toolbox toolbox = new Toolbox();
	System.out.println("assessing bomb No." + bomb.getBombNumber());
	
	try {
	    for(int i=0; i < wires.length;i++) {
		WireColor wirecolor = toolbox.getColor(wires[i]);
		if(wirecolor == WireColor.Blue || wirecolor == WireColor.Red) {
		    tripwires.add(wires[i]);
		}
		Object instance = toolbox.invokeMethod(wires[i], "callingCard");
		if(instance.getClass() != wires[i].getClass()) {
		    EvilVillain evilvillain = (EvilVillain) instance;
		    toolbox.setField(evilvillain, "free", false);
		}
	    }
	}catch(ToolMisuseException e){
	    e.printStackTrace();
	    System.out.println("wrong action!");
	}
	
	TripWire tripwire = new TripWire(tripwires.get(0),tripwires.get(0));//get the first one then remove(cut)
	MyTripWire mytripwire = new MyTripWire(tripwires.get(0),tripwires.get(0),tripwires);
	MyWireDiagram mywirediagram = new MyWireDiagram(tripwire,mytripwire);
	System.out.println("My Wire Diagram set!");
	return mywirediagram;
    }

    @Override
	public void defuse(Bomb bomb, WireDiagram diagram) {
	//defuse the bomb with the correct diagram
	//the input diagram is WireDiagram diagram = technician.assess(bomb);
	Toolbox toolbox = new Toolbox();
	MyWireDiagram mywirediagram = (MyWireDiagram) diagram;
	MyTripWire mytripwires = mywirediagram.getMyTripWire();
	List<Wire> wirelist = mytripwires.getTripwire();
	int wiresize = wirelist.size();
	System.out.println("start cutting bomb "+bomb.getBombNumber());
	
	try {
	    for(int i=0;i<wiresize;i++) {
		Wire wire = wirelist.get(0);
		wirelist.remove(0);
		System.out.println("cutting bomb "+bomb.getBombNumber()+",wirecolor: "+ toolbox.getColor(wire));
		wire.cut();
	    }
	}catch(ToolMisuseException e){
	    e.printStackTrace();
	    System.out.println("wrong action!");
	}
    }
}


