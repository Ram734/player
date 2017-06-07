import java.util.*;
class anagram
{
public static void main(String args[])
{
String s1[]={"mary","army"};
char[] f=s1[0].replaceAll(" ","").toCharArray();
char[] f1=s1[1].replaceAll(" ","").toCharArray();
Arrays.sort(f);
Arrays.sort(f1);
if(Arrays.equals(f,f1))
{
System.out.print("Anagram");
}
else
{
System.out.print("Not an Anagram");
}
}
}
