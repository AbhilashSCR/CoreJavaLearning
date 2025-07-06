package Polymorphism_Methodoverride;

public class Lab148 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Trees t= new Trees();
		t.fruit();
		
		
		Trees t1= new Apple();
		t1.fruit();
		
		Apple a= new Apple();
		a.fruit();
		
		
		Trees t2= new Mango();
		t2.fruit();
		
		Mango m= new Mango();
		m.fruit();
		
		Banana b = new Banana();
		b.fruit();
		
		Trees t3= new Banana();
		t3.fruit();
		
		
	}

}
