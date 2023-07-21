import java.util.*;
class diagonal {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int a = scan.nextInt();
int arr[][]=new int[a][a];
int sum=0,sum1=0,i,j;
for(i=0;i<3;i++){
for(j=0;j<3;j++){
arr[i][j]=scan.nextInt();
}}
for(i=0;i<3;i++){
for(j=0;j<3;j++){
if(i==j)
{
sum=sum+arr[i][j];
}
if(i+j==a-1)
{
sum1=sum1+arr[i][j];
}
}}
System.out.println("sum of rigth="+sum);
System.out.println("sum of rigth="+sum1);
}}