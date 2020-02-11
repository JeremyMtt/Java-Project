package edu.nyu.cs9053.homework7;

public class main {
    public static void main(String[] args) {
	SheepArrayCreator sheeparraycreator = new SheepArrayCreator();
	Repository<Sheep> repository1 = new Repository<>(sheeparraycreator,5);
	Sheep sheep1 = new Sheep("Sienna");
	Sheep sheep2 = new Sheep("yxy");
	repository1.add(sheep1);
	repository1.add(sheep2);
	for(int i = 0; i < 2; i++) {
	    System.out.println(repository1.get(i).getName());
	}
    }
}