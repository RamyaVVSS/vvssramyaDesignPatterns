package behavioural;

public class Mediator {
	public static void main(String[] args) {
		Messages list = new ExchangeInfo();
		
		Members person1 = new ShowMessages(list, "Ramya");
		Members person2 = new ShowMessages(list, "Soumya");
		Members person3 = new ShowMessages(list, "Akhil");
		Members person4 = new ShowMessages(list, "Madhav");
		
		list.addPersons(person1);
		list.addPersons(person2);
		list.addPersons(person3);
		list.addPersons(person4);
		
		person3.SendMessage("Hey, how are you?");
		
	}
}
