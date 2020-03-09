package behavioural;

public class ShowMessages extends Members{
	public ShowMessages(Messages mediator, String name) {
		super(mediator, name);
	}

	@Override
	public void SendMessage(String message){
		System.out.println(this.name+": Sending Message = "+message);
		mediator.sendMessage(message, this);
	}
	@Override
	public void ReceiveMessage(String message) {
		System.out.println(this.name+": Received Message: "+message);
	}

}