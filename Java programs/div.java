import java.util.*;
class div
{
int a;
public static void main(String[] agrs){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
for(int i=1;i<a+1;i++)
{
if(a%i==0)
{
System.out.println(i+" ");
}
}
}
}