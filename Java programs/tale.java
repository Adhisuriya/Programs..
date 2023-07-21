import java.util.*;
class main{
public static void main(String[]agrs){
Scanner sc=new Scanner(System.in);
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
int a[][]={{7,9,8},{5,7,3},{7,5,3}};
if((i==0&&j==1))
{
System.out.print(" "+(a[0][0]+a[0][1]+a[0][2]));
}
else if(i==0&&j==0||i==1&&j==0||i==2&&j==0){
System.out.print(" *");
}
else if(i==0&&j==2){
System.out.print(a[0][1]-a[0][2]+"");}
else if(i==1&&j==1){
System.out.print(" "+(a[0][1]-a[0][2]));
}
else if(i==2&&j==2){
System.out.print(+(a[2][1]+a[2][2])+(a[2][1]-a[2][2]));}
else if(i==2&&j==1){
System.out.print("");}
else{
System.out.print(a[i][j]);
}
}
System.out.println();
}
}
}