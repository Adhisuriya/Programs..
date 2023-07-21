import java.util.Scanner;
public class maximum {
public static void high_element( int[][] a) {
int i = 0, temp = 0;
int[] b = new int[3];
while (i < 3) {
for (int j = 0; j < 3; j++) {
if (a[i][j] > temp) {
temp = a[i][j];}}
b[i] = temp;
temp = 0;
i++;
}
print(b);
}
private static void print(int[] b) {
for(int i = 0; i < b.length; i++) {
System.out.println(b[i]);
}
}
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
    int[][] a = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = in.nextInt();
            }
        }

        high_element(a);
    }
}