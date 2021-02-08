import java.util.Scanner;
class pyt 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter your age");
		int a=s.nextInt();
		if(a>18)
		{
			System.out.println("you are eligible for voting");
		}
		else
		{
			System.out.println("you are not eligible for voting");
		}
	}
}
