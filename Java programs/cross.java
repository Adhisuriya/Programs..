import java.util.*;
public class cross{
public static void main(String[]agrs)
{
Scanner sc=new Scanner(System.in);
int a[][]=new int[3][3];

for(int i=0;i<a.length;i++)
{
for(int j=0;j<a.length;j++)
{
a[i][j]=sc.nextInt();
}}
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a.length;j++)
{
if((i==0&&j==0)||(i==0&&j==2)||(i==2&&j==0)||(i==2&&j==2))
{
System.out.print(a[i][j]+a[1][1]+" ");}
else if((i==2&&j==1||i==1&&j==2))
{
/*System.out.print(a[1][1]+a[1][0]+"");
System.out.print(a[1][1]+a[1][2]+"");
System.out.print(a[1][1]+a[2][1]+"");*/
System.out.print(a[2][1]+a[1][2]+"");}
else if(i==1&&j==1){
System.out.print(a[i][j]+"");}
else if(a[i][j]<10)
{
System.out.print("s");}
else {
System.out.print("D");}
System.out.print(" ");
}
System.out.println();}
}}
