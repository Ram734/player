import java.util.*;
class vowels
{
	public static void main(String args[])
	{
		String k=args[0];
		//char h[]=args[0].toCharArray();
		char f[]={'a','e','i','o','u'};
		for(char v:f)
		{
			k=k.replace(""+v,"");
		}
		System.out.print(k);
	}
}