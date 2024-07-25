package CentrictoAll6_Variabletypes;

public class Lab152 {

  public static void main(String[] args)
  {
	  
	  System.out.println(StaticDemo.college_name);
	  StaticDemo.printname();
	  
	  StaticDemo s1= new StaticDemo();
	  s1.printyear();
	  
	//It prints the declared version with a  college name
	//It prints default version with college name

	  StaticDemo s2= new StaticDemo();
	  s1.passout=2016;
	  s1.printyear();
	  
	  StaticDemo.college_name="JNTUH";
	  StaticDemo.printname();
  }
  
}
