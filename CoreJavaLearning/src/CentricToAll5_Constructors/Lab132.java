package CentricToAll5_Constructors;

public class Lab132 {

	public static void main(String[] args)
	{
		Employee employee=new Employee();
		employee.employeename="Abhilash";
		employee.department="Data";
		employee.domain="Healthcare";
		employee.employeeage=30;
		employee.employeeid=680;
		employee.skillset="Software testing skills";
		employee.workexperience=4;
		employee.workhours=8;
		employee.ismarried=false;
		employee.dependents=2;
		employee.salaryperannum=600000;
		
		System.out.println("Following are one of the employee detials");
		
		System.out.println(employee.employeename);
		System.out.println(employee.department);
		System.out.println(employee.domain);
		System.out.println(employee.employeeage);
		System.out.println(employee.employeeid);
		System.out.println(employee.skillset);
		System.out.println(employee.salaryperannum);
		System.out.println(employee.workexperience);
		System.out.println(employee.workhours);
		System.out.println(employee.ismarried);
		System.out.println(employee.dependents);
		
		
		
	}
}
