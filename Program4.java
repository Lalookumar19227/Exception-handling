class Program4
{
	public static void main(String[] args)
	{
		Car c1=new Car("MAruti");
		System.out.println("Name is: "+c1.name);
		c1=null;
		System.out.println("Name is: "+c1.name);
	} 
}