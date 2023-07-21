/*import java.util.*;
class star{
public static void main(String []agrs){
Scanner sc= new Scanner(System.in);
int a = sc.nextInt();
for(int i=0;i<a;i++)
{
System.out.print("*");
} 
System.out.println(" ");
for(int i=0;i<a;i++)
{
System.out.println("*");
}
for(int i=0;i<a;i++)
{System.out.print("*");
}
for(int j=0;j<a;j++)
{
System.out.println("*");
}
System.out.println("  ");
}
}*/
import java.util.*;
class main{
public static void main(String[]agrs){
Scanner sc=new Scanner(System.in);
int a[][]=new int[3][3];
for(int i=0;i<3;i++){
    for(int j=0;j<3;j++){
a[i][j] =sc.nextInt();
    }
}
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
 a[i][j]=sc.nextInt();
if((i==0&&j==1)){
              System.out.print(" "+(a[0][0]+a[0][1]+a[0][2]));
}
else if(i==0&&j==0||i==1&&j==0||i==2&&j==0){
System.out.print(" * ");
}
System.out.print(a[i][j]);}
System.out.println();
}
}
}
