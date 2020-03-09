package structural;

public class Bridge {
	public static void main(String[] args) {
		GetFlowers sunflower = new Sunflower(new Yellow());
		sunflower.getColour();
		
		GetFlowers lotus = new Lotus(new Pink());
		lotus.getColour();
	}
}
