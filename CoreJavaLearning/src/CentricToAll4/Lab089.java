package CentricToAll4;

public class Lab089 {
	
	public static void main(String[] args)
	{
		
		int[] numberofparliamentconstituenciesintelangana= {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		
		
		String[] no_ofparliamentconstituenciesintelangana= {"Adilabad","Peddapalle","Karimnagar","Nizambad","Zahirabad","Medak","Malkajgiri","Secunderabad","Hyderabad","Chevella","Mahbubnagar","Nagarkurnool","Nalgonda","Bhongir","Warangal","Mahabubabad","Khammam"};
		
		
		System.out.println("There are "+ numberofparliamentconstituenciesintelangana.length + " parliament constituencies in telangana listed below");
		for(int i=0;i<=no_ofparliamentconstituenciesintelangana.length-1; i++)
		{
			System.out.println(no_ofparliamentconstituenciesintelangana[i]);
		}
		
		
	}
}