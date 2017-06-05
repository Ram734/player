import java.util.*;
class digrev
{
public static void main(String args[])
{
int n[]=new int[args.length];
for(int i=0;i<args.length;i++)
{
	n[i]=Integer.parseInt(args[i]);
}
Arrays.sort(n);
for(int i=args.length;i>0;i--)
{
	System.out.print(n[i-1]);
}
}
}