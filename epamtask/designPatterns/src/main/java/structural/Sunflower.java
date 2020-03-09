package structural;

public class Sunflower extends GetFlowers{
	public Sunflower(GetColours col) {
		super(col);
		
	}

	@Override
	public void getColour() {
		System.out.print("Sunflower is ");
		colour.getColour();
	}
}
