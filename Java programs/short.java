import java. util.*;{
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int rows =sc.nextInt();
int columns = sc.nextInt();
int[][] array = new int[rows][columns];

		int value = 1;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				array[i][j] = value;
				value++;
			}
		}

		System.out.println("The 2D array is: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
