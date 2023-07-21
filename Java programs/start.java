import java.util.Scanner;

class start {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a=sc.nextInt();
        for(int i=0;i<13;i++){
            for(int j=0;j<6;j++){

                if((i==7&&j==0||i==7&&j==14||i==6&&j==1||i==6&&j==13||i==5&&j==3||i==5&&j==4||i==5&&j==5||i==5&&j==6||i==5&&
                j==4||i==4&&j==11||i==3&&j==5||i==3&&j==10||i==2&&j==4||i==2&&j==9||i==1&&j==5||i==1&&j==8||i==0&&j==6||i==0&&j==7))
                {
            System.out.print("*");
        }
else
{System.out.println();
}
        }
}
    }
}
