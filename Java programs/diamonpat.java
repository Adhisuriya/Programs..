import java.util.*;
class binpat{
public static void main(String[]agrs)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
if(i==n/2&&j==n/2)
{
System.out.print("1");
}


System.out.print("*");
}
System.out.println();}
}
}