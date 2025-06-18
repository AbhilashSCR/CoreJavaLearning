package CentricToAll5_Constructors;

public class Param {
	
	
	String school;
	String student;
	char gender;
	int age;
	int standard;
	
	

   //Declaring the parameterized constructor using this keyword

  Param(String valuefromreferenceobject)
  {
	  this.school=valuefromreferenceobject;
	  this.student=valuefromreferenceobject;
	  
  }

  Param(char valuefromreferenceobject)
  {
  this.gender=valuefromreferenceobject;
  
  }
  Param(int valuefromreferenceobject)
  {
	  
	  this.age=valuefromreferenceobject;
	  this.standard=valuefromreferenceobject;
  }
	  

  }
  