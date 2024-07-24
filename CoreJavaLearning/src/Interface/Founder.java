package Interface;

 interface Founder {

	void earned100cr();
	
	default void print()
	{
		System.out.println("I am a default method");
	}
	
	static void print2()
	{
		System.out.println("I am a static method");
	}
	
}
