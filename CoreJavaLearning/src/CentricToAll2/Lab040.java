package CentricToAll2;
import java.util.Scanner;
public class Lab040 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//✅ Triangle Classifier:
        //
        //   Write a program that classifies a triangle based on its side lengths.
        //   Given three input values representing the lengths of the sides, determine if the triangle is Equilateral (all sides are equal),
        //   Isosceles (exactly two sides are equal)
        //   Scalene (no sides are equal).
        //   Use an if-else statement to classify the triangle.
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the length of Side1");
		int side1= sc.nextInt();
		System.out.println("Enter the length of Side2");
		int side2=sc.nextInt();
		System.out.println("Enter the length of Side3");
		int side3=sc.nextInt();
		
		if(side1==side2 && side2==side3 && side3==side1)
		{
			System.out.println("It is an equilateral triangle");
		}
		else if(side1==side2 || side2==side3 || side3==side1)
		{
			System.out.println("It is an Isoscelse triangle");
		}
		else
		{
			System.out.println("It is an Scalene triangle");
		}
		
	}

}
