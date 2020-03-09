package structural;

public class Lotus extends GetFlowers{
	public Lotus(GetColours col) {
		super(col);
		
	}

	@Override
	public void getColour() {
		System.out.print("Lotus is ");
		colour.getColour();
	}
}
