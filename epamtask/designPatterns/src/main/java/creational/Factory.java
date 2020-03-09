package creational;

public class Factory {
	public static void main(String[] args) {
	      
		  CyclesFactory cycles = new CyclesFactory();

	      Cycles cycle1 = cycles.getCycles("Atlas");
	      cycle1.book();
	     
	      Cycles cycle2 = cycles.getCycles("Ladybird");
	      cycle2.book();
	 }
}
