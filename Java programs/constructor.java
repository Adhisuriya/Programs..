import java.util.*;
class constructor
{
int id;
String name;
constructor(int i,String n)
{
id = i;
name=n;
}
void display() 
{
System.out.println(id+" "+name);}
public static void main(String agrs[])
{
constructor s1=new constructor(111,"kavin");
constructor s2=new constructor(222,"kumar");
s1.dispaly();
s2.dispaly();
}
}



































