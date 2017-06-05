import java.util.*;
class factorial
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int c=sc.nextInt();
int fact=1;
if(c==0 || c==1)
{
System.out.print(1);
}
else if(c>1)
{
for(int i=2;i<=c;i++)
{
fact=fact*i;
}
System.out.print(fact);
}
}
}
