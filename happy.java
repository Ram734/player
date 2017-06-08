import java.util.*;
class happy
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int f=sc.nextInt();
        while(f!=1)
        {
            int a=0;
        while(f>0)
        {
            int g=0;
            g=f%10;
            a+=(g*g);
            f=f/10;
        }
            if(a==1)
            {
                System.out.print(a +"is a Happy number");
                System.exit(0);
            }
            else
            {
              f=a;
            }
        }
            
        
        
            
    } 
}



