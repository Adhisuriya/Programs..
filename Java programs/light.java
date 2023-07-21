import java.util.*;
class lightyear
{
    public static void main(String[] args) 
{
        long a;
        long b;
        long c;
        long l=186000;
        Scanner sc=new Scanner(System.in);
        a=sc.nextLong();
        b=a*24*60*60;
        c=b*l;
        System.out.print(c);
}
}