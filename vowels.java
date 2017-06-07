import java.util.*;
class vowels
{
	public static void main(String args[])
	{
		String k=args[0];
		//char h[]=args[0].toCharArray();
		String s=(new StringBuffer(k)).reverse().toString();
		System.out.println(s);
		char f[]={'a','e','i','o','u'};
		for(char v:f)
		{
			s=s.replace(""+v,"");
		}
		System.out.println(s);
	}
}