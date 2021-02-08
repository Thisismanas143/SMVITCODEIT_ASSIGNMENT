import java.util.Scanner;
public class entry 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter your name");
		String a=s.nextLine();
		System.out.println("enter your age");
		int age=s.nextInt();
		System.out.println("enter sex ");
		String sex=s.nextLine();
		System.out.println("entered values are:");
		System.out.println("name:"+a);
		System.out.println("age:"+age);
		System.out.println("sex:"+sex);
		
	}
}
