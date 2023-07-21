import java.util.*;
class rect{
void display1(){
Scanner sc=new Scanner(System.in);
int l=sc.nextInt();
int w=sc.nextInt();
System.out.println(l*w);
}
}
class tri{
void display2(){
Scanner s=new Scanner(System.in);
int h=s.nextInt();
int b=s.nextInt();
System.out.println(0.5*(h*b));
}}
class circle
{ 
void display3(){
Scanner c=new Scanner(System.in);
int R=c.nextInt();
System.out.println(3.14*R*R);
}}
class main{
public static void main(String[]agrs){
rect sc=new rect();
tri s=new tri();
circle c=new circle();
sc.display1();
s.display2();
c.display3();
}}


