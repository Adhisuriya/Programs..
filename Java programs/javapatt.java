import java.util.*;
class java{
public static void main(String[]agrs){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int transpose[][]=new int[n][n] ;
int a[][]=new int[n][n];
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
a[i][j]=sc.nextInt();
System.out.print("");
}
System.out.println();
}
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
transpose[i][j]=a[j][i];
System.out.print(transpose[i][j]+" ");
}
System.out.println();
}
}

}
