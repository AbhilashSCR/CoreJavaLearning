package ComparableandComparatorInterface;

import java.util.Comparator;

class sortbystudentname implements Comparator<Student>
{

	//Note: We use comparator interface to fetch both string and integer values 
	//using implements keyword for sorting mechanism

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o2.getStudentname().compareTo(o1.getStudentname());
	}
	
}

class sortbyrollnumber implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o2.getRollnumber().compareTo(o1.getRollnumber());
	}
	
}

class sortbystudentnameAsc implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o2.getStudentname().compareTo(o1.getStudentname());
	}
	
}


class sortbyrollnumberDesc implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o2.getRollnumber().compareTo(o1.getRollnumber());
	}
	
}
public class Student implements Comparable<Student>{
	
	
	
	public Student(Integer rollnumber, String studentname) {
		this.rollnumber = rollnumber;
		this.studentname = studentname;
	}
	
	public Integer getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(Integer rollnumber) {
		this.rollnumber = rollnumber;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	
	Integer rollnumber;
	String studentname;
	
	
	@Override
	public String toString() {
		return "Student [rollnumber=" + rollnumber + ", studentname=" + studentname + "]";
	}

	@Override
	public int compareTo(Student student2) {
		// TODO Auto-generated method stub
		return CharSequence.compare(this.studentname, student2.studentname);
	}
}


	/***@Override
public int compareTo(Student student2) {
		// TODO Auto-generated method stub
		return Integer.compare(this.rollnumber, student2.rollnumber);
	}
}**/
