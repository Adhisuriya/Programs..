import java.util.*;
class modules
{
public static void main(String[] args){
Scanner obj=new Scanner(System.in); 
int N=obj.nextInt();
if(N%3==0)
{
System.out.println("divisble"+N*3);
}
int a=0;
int sum=0;
for(int i=0;i<3;i++)
{
sum=sum+a;
}
System.out.println("sum is:"+sum);
if(sum<10)
{
sum=sum/10;
System.out.println("sum is:"+sum);
}
if(sum<100)
{
sum=sum/100;
System.out.println("sum is:"+sum);
}
if(sum<1000)
{
sum=sum/1000;
System.out.println("sum is:"+sum);
}

else
{
System.out.println("not divisble by 3");
}
}
}