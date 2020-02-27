package test1;

public class Hoagie {
	private final String protein;
	private final String bread;
	public Hoagie(String protein, String bread) {
		this.protein = protein;
		this.bread = bread;
	}
	public String getSandwich() {
		return String.format("%s%s%s", bread, protein, bread);
   }
}
