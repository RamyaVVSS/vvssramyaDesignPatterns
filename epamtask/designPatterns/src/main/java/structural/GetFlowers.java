package structural;

public abstract class GetFlowers {
	protected GetColours colour;

	//constructor with implementor as input argument
	public GetFlowers(GetColours col){
		this.colour=col;
	}

	abstract public void getColour();

}
