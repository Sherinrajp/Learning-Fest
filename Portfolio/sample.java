import java.util
public class Fibonacci
{
    public static void main(string []args)
    {
        int n1=0,n2=0,n3,i,count=10;
        System.out.println(n1+""+n2);
        for (i=2; i<count+1; ++i)
        {
            n3 = n1 + n2;
            system.out.println(""+n3);
            n1 = n2;
            n2 = n3;
            }

    }
}