import java.util.Scanner;
class Program14
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] a={12, 4, 0, 30, 80};
		System.out.println("Enter the 1st index: ");
		int p=sc.nextInt();
		System.out.println("Enter the 2nd index: ");
		int q=sc.nextInt();
		try{
			System.out.println("try block starts");
			System.out.println(a[p]/a[q]);
			System.out.println("inside try block");
		}
		catch(ArithmeticException e){
			System.out.println(e);
			System.out.println("===============getMessage()===========");
			e.getMessage();
			System.out.println("======");
			e.getCause();
			System.out.println("======");
		}
		catch(Exception e){
			System.out.println(e);
			System.out.println("===============getMessage()===========");
			e.getMessage();
			System.out.println("======");
			e.getCause();
			System.out.println("======");
		}
		System.out.println("Thank You!!");
	} 
}



