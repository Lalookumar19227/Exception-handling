import java.util.Scanner;
class Program18
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Number: ");
		try {
			int n=sc.nextInt();
			System.out.println("n is: "+n);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("Input is not Valid!!");
		}
		finally {
			System.out.println("Program ends!!");
			sc.close();
		}
	} 
}



