import java.io.*;
class Program5
{
	public static void main(String[] args)
	{
		System.out.println("This is program5 to create a file");
		File f1=new File("f:\\mohan.txt");
		try{
			f1.createNewFile();
			System.out.println("FIle is created!!");

		}
		catch(Exception e)
		{
			System.out.println("FIle is NOT created!!");

		}
		System.out.println("Program Ends");
	} 
}