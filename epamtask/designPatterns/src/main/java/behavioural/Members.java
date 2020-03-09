package behavioural;

public abstract class Members {
	protected Messages mediator;
	protected String name;
	
	public Members(Messages mediator, String name){
		this.mediator=mediator;
		this.name=name;
	}
	
	public abstract void SendMessage(String message);
	public abstract void ReceiveMessage(String message);
}
