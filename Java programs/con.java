import java .util.*;
class box
{
    float depth;
    float heigth;
    float breath;
    float  vol;
    box()
{
    Scanner sc=new Scanner(System.in);
    depth=sc.nextFloat();
    heigth=sc.nextFloat();
    breath=sc.nextFloat();
     vol= depth*heigth*breath;
}
}
     class con
     public static void main(String[]agrs)
        {
            box mybox=new box();
            System.out.println(vol);
        }
