package creational;

import java.util.List;

public class Prototype {
	public void getStudentsNewList() throws CloneNotSupportedException {
		
		ModifyStudents students = new ModifyStudents();
		students.getData();
		
		ModifyStudents student1 = (ModifyStudents) students.clone();
		ModifyStudents student2 = (ModifyStudents) students.clone();
		List<String> list1 = student1.getStudentList();
		list1.add("Ramya");
		List<String> list2 = student2.getStudentList();
		list2.remove("Soumya");
		
		System.out.println("Students List: "+students.getStudentList());
		System.out.println("New Students List1 after modification: "+list1);
		System.out.println("New Students List2 after modification: "+list2);
		
	}
}
