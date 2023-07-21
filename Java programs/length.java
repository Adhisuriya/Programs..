import java.util.*;
class length{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int d=a+b;
d=d-c;
if(0>d)
{
System.out.println(d*-1);}
else
{
System.out.println(d);}
System.out.println();
}
}