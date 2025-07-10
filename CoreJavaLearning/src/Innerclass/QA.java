package Innerclass;

public class QA {
	
	public static void main(String[] args)
	{
		
		role1 r1= new role1("I love detecting defects");
		role1.Softwaretester st= r1.new Softwaretester(3);
		st.yoe();
		r1.identify();
	
		
		
	}
}




class role1
{
	String bughunting;
	
	public role1(String bughunting){
		this.bughunting=bughunting;
	}
	
	void identify()
	{
		System.out.println("Indentify and report the bugs is my primary responsibility");
	}
	


class Softwaretester
{
	int experience;
	
	public Softwaretester(int experience)
	{
		this.experience=experience;
	}
	
	void yoe()
	{
		System.out.println("3 years of experience in manual testing");
	}
}
}