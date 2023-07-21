import java.util.*;
class Main {
  public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int a[]=new int[n];
  int max=a[0];
  for(int i=0;i<a.length;i++)
    {
    a[i]=sc.nextInt();

    if(a[i]max)
    {
    System.out.print(a[i]);
  }
else
{
System.out.print("");
}
}
}}