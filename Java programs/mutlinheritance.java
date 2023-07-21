import java.util.*;
class circle
{
Scanner sc2=new Scanner(System.in);
void display2()
{
int r;
r=sc2.nextInt();
float area2;
float p=3.14f;
area2=p*r*r;
System.out.print("radius:"+area2);
}
}
class rect extends circle
{
Scanner sc=new Scanner(System.in);
void display()
{
int l,b,area;
l=sc.nextInt();
b=sc.nextInt();
area=l*b;
System.out.print("rectangle:"+area);
}
}
class square extends rect
{
Scanner sc1=new Scanner(System.in);
void display1()
{
int l1,area1;
l1=sc1.nextInt();
area1=l1*l1;
System.out.print("square:"+area1);
}
}
class main 
{
public static void main(String[]agrs)
{
square my =new square();
my.display();
my.display1();
my.display2();
}
}