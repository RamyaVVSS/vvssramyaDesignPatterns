package behavioural;

import java.util.ArrayList;
import java.util.List;

public class ExchangeInfo implements Messages{
	private List<Members> persons;

	public ExchangeInfo(){
		this.persons=new ArrayList();
	}

	public void sendMessage(String message, Members sender) {
		for(Members m : this.persons){
			if(m != sender){
				m.ReceiveMessage(message);
			}
		}
		
	}

	public void addPersons(Members persons) {
		this.persons.add(persons);
		
	}

}
