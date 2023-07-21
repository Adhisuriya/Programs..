import java.util.*;
class element{
public static void main(String[]agrs){
Scanner sc=new Scanner(System.in);
int row=sc.nextInt();
int column=sc.nextInt();
int array[][]=new int[row][column];
for(int i=0;i<row;i++){
for(int j=0;j<column;j++){
array[i][j]=sc.nextInt();
System.out.print(array[i][j]+" ");
}
System.out.println();
}
for(int i=0;i<row;i++){
for(int j=0;j<column;j++){
 if(i==0&&j==0){
System.out.print(array[1][1]);}
else if(i==1&&j==1){
System.out.print(array[0][0]);}
else
{
System.out.print(-array[i][j]+" ");}
}
System.out.println();
}
}
}