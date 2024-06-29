package CentricToAll4;

public class Lab104 {
	public static void main(String[] args)
	{
		
		//Understanding the difference between == operator and equals method
		
		
		int[] arr1= {1,2,3,4,5};
		int[] arr2= {1,2,3,4,5};
		
		System.out.println(arr1==arr2);
		//O/p will be false since the memory location of arr1 and arr2 are different
		
		System.out.println(arr1.equals(arr2));
		//O/p will be false since the memory location of arr1 and arr2 are different
		
		int[] arr3=arr1;
		System.out.println(arr3==arr1);
		//Since, array1 is assigned to array3 the value remains same.array3 is referring to array1
		
	
		System.out.println(arr1.equals(arr3));
		//O/p will be true , since the values and references remains same
		
		
		
		//Tricky question
		
		 arr1[0]=5;
		 arr1[2]=7;
		 arr3[4]=9;
		//Since, we have assigned arr3=arr1.
	    // If the value of any element changes in array3 it reflects array1 as well
		System.out.println(arr3[0]);
		System.out.println(arr3[2]);
		System.out.println(arr1[4]);
		System.out.println(arr1[0]);
		System.out.println(arr1[2]);
		System.out.println(arr3[4]);
		
		
		
		
	}

}
