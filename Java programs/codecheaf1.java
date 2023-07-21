import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
public static void main (String[] args) throws java.lang.Exception
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0){    
int count=0;
int n=sc.nextInt();
int a[]=new int[n];
for(int j=0;j<n;j++){
a[j]=sc.nextInt();
if(a[j]>=6){
count++;
}
}
System.out.println(count);     
}
}
}
		   
		   
