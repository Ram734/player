import java.util.*;
class oe
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
		int s=0;
		int g;
		while(n>0)
		{
			    g=n%10;
		        n=n/10;
				a=g%2;
				if(a!=0)
				{
					s+=g;
				}
		}
			if(s%2==0)
			{
				System.out.print("-1");
			}
			else
			{
				System.out.print("1");
			}
	}
}