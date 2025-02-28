package CentricToAll1;

public class Lab021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//'\n'----//Next line
        //'\t'----//Add tab or provide a space
        //'\b'----//Deletes the last character of the 1st string
        //'\r'----//Deletes the 1st String
        
      
		
      //String examples
        String Surname="Vemula";
        String Firstname="Abhilash";
        String Middlename="Sharma";
        System.out.println(Firstname + '\n' + Middlename + '\n'+ Surname) ;
        System.out.println(Firstname+'\t'+Middlename);  
        char c='\b';
        System.out.println("Abhilash"+c+ "Sharma"); //In intellij its working fine
        System.out.println("vemula" + '\r'+"Vicky");
	}

}
