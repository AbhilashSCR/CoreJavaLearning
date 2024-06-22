package CentricToAll2;
import java.util.Scanner;
public class Lab044 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the state name, will fetch the respective capital city");
		String statename=sc.next();
		
		switch(statename)
		{
		case "Telangana":
			System.out.println("Hyderabad is a capital of Telangana");
			break;
		 
		case "AndhraPradesh":
			System.out.println("Amaravathi is a captital of Andhrapradesh");
			break;
		case "Karnataka":
			System.out.println("Banglore is a capital of karnataka");
			break;
		case "kerala":
			System.out.println("Thiruvananthapuram is a capital of kerala");
			break;
		case "Tamilnadu":
			System.out.println("Chennai is a capital of tamilnadu");
			break;
		case "Uttarpradesh":
		    System.out.println("Lucknow is a capital of UP");
		    break;
		case "Uttarakand":
			System.out.println("Deharadun is a capital of Uttarakand");
			break;
		case "Ladakh(UT)":
			System.out.println("Leh & Kargil is a capital of ladakh");
			break;
		case "Himachalpradesh":
			System.out.println("Shimla & Dharamshala is a capital of HP");
			break;
		case "Punjab":
			System.out.println("Chandigarh(UT) is a capital of punjab");
			break;
		case "Haryana":
			System.out.println("Chandigarh(UT) is a capital of haryana");
			break;
		case "Delhi(UT)":
			System.out.println("New Delhi is a capital of delhi(UT");
			break;
		case "Chandigarh(UT)":
			System.out.println("Chandigarh is a capital of Chandigarh(UT) ");
			break;
		case "Jammu&Kashmir":
			System.out.println("Srinagar & Jammnu is a capital of jammu&kashmir");
			break;
		case "Rajasthan":
			System.out.println("Jaipur is a capital of rajasthan");
			break;
		case "Maharashtra":
			System.out.println("Mumbai is a capital of Maharashtra");
			break;
		case "Gujarat":
			System.out.println("Gandinagar is a capital of Gujarat");
			break;
		case "Dadra and nagar haveli and daman and diu":
			System.out.println("Daman is a capital of DNHDD");
			break;
		case "Odisha":
			System.out.println("Bhubaneshwar is a capital of Odisha");
			break;
		case "Bihar":
			System.out.println("Patna is a capital of bihar");
			break;
		case "Westbengal":
			System.out.println("Kolkata is a capital of westbengal");
			break;
		case "Jharkhand":
			System.out.println("Ranchi is capital of Jharkhand");
			break;
		case "Arunachalpradesh":
			System.out.println("Itanagr is a captil of AP");
			break;
		case "Assam":
            System.out.println("Dispur is a capital of Assam");
            break;
        case "Meghalaya":
            System.out.println("Shillong is a the capital of Meghalaya");
            break;
        case "Manipur":
            System.out.println("Imphal is a  capital of Manipur");
            break;
        case "Mizoram":
            System.out.println("Aizawal is a  capital of Mizoram");
            break;
        case "Nagaland":
            System.out.println("Kohima is a capital of Nagaland");
            break;
        case "Tripura":
            System.out.println("Agartala is a capital of Tripura");
            break;
        case "Sikkim":
            System.out.println("Gangtok is a capital of Sikkim");
            break;    
        case "Goa":
            System.out.println("Panaji is a capital of Goa");
            break;  
        case "Portblair":
            System.out.println("Is the capital of Andaman and nicobar Island");
            break;
        case "Puducherry(UT)":
            System.out.println("Pondicherry is a capital of Puducherry(UT)");
            break;
        case "Lakshadweep(UT)":
            System.out.println("Kavarathi is a capital of Lakshadweep(UT)");
            break;
        default:
            System.out.println("Not a part of india");
    }
		
			
		}
		
		
		
	}


