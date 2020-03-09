package creational;

public class CyclesFactory {
	public Cycles getCycles(String cycle_types){
	      if(cycle_types == null){
	         return null;
	      }		
	      if(cycle_types.equalsIgnoreCase("Atlas")){
	         return new Atlas();
	         
	      } else if(cycle_types.equalsIgnoreCase("Ladybird")){
	         return new Ladybird();
	      }
	      return null;
	}
}
