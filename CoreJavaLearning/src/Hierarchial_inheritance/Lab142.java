package Hierarchial_inheritance;

public class Lab142 {

	public static void main(String[] args)
	{
		
		SDETCareer sc=new SDETCareer();
		sc.careerpathway();
		
		JrSDET jr= new JrSDET();
		jr.careerpathway();
		
		SrSDET sr=new SrSDET();
		sr.careerpathway();
		
		SDETlead sl=new SDETlead();
		sl.careerpathway();
		
		SDETManager sm=new SDETManager();
		sm.careerpathway();
		
		Director d= new Director();
		d.careerpathway();
		
		
	}
}
