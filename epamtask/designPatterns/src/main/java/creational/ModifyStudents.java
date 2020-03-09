package creational;

import java.util.ArrayList;
import java.util.List;

public class ModifyStudents implements Cloneable{
	private List<String> newList;

	public ModifyStudents(){
		newList = new ArrayList<String>();
	}

	public ModifyStudents(List<String> list){
		this.newList=list;
	}
	public void getData(){
		
		newList.add("Soumya");
		newList.add("Tejaswini");
		newList.add("Nandini");
		newList.add("Madhav");
	}

	public List<String> getStudentList() {
		return newList;
	}

	@Override
	public Object clone() throws CloneNotSupportedException{
		List<String> temp = new ArrayList<String>();
		for(String s : this.getStudentList()){
			temp.add(s);
		}
		return new ModifyStudents(temp);
	}

}
