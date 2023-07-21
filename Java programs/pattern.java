import java.util.*;
class pattern{
public static void main(String[]agrs){
Scanner sc=new Scanner(System.in);
int a[][];
for(int i=0;i<a;i++)
{
for(int j=0;j<i;j++)
{
a[i][j]=sc.nextInt();
if((i==0||j==1)&&(i==0||j==3))
{
System.out.print("*");

