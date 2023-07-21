import java.util.*;
class greatenum
{
public static void main(String[]agrs)
{
Scanner sc=new Scanner(System.in);
int size=sc.nextInt();
int arr[]=new int[size];
for(int i=0;i<size;i++)
{
arr[i]=sc.nextInt();
System.out.print(arr[i]);
}  
int num=sc.nextInt();
for(int i=0;i<size;i++)
{
if(num<=arr[i])
{
System.out.println("greater:"+arr[i]);
}
}
}
}