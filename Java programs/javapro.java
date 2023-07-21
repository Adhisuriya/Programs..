import java.util.*;
class transpose
{ 
public static void main(String[]agrs)
{
Scanner sc=new Scanner(System.in);
int a[][]={{1,2,3},{4,5,6}};
int b[][]=new int[3][3];

for(int c=0;c<2;c++)
{
for(int d=0;d<=2;d++)
{

System.out.print(a[c][d]+"");
}
for(c=0;c<2;c++)
{
for(int d=0;d<=2;d++)
{
b[d][c]=a[c][d];
System.out.print(b[c][d]+"");
}
System.out.println();
}
}
}
}
