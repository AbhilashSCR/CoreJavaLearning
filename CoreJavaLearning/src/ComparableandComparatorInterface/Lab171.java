package ComparableandComparatorInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab171 {
	
	public static void main(String[] args)
	{
		Student student1=new Student(1,"Rahul");
		Student student2=new Student(7,"Abhilash");
		Student student3=new Student(21,"Dharam");
		
		List<Student> students=new ArrayList<Student>();
		students.add(student1);
        students.add(student2);
        students.add(student3);
        System.out.println(students);
        
        Collections.sort(students);
        System.out.println(students);
        
        Collections.sort(students,new sortbystudentname());
        System.out.println(students);
        Collections.sort(students,new sortbyrollnumber());
        System.out.println(students);
        Collections.sort(students, new sortbystudentnameAsc());
        System.out.println(students);
        Collections.sort(students, new sortbyrollnumberDesc());
        System.out.println(students);
        
	}

}

