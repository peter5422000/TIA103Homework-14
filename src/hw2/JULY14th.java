package hw2;

public class JULY14th {

	public static void ninenine() {
		int i, j;
		for (i = 1; i <= 9; i++) {
			j = 1;
			while (j <= 9) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j += 1;
			}
			System.out.println();
		}
	}

	public static void ninenine2() {
		int i, j;
		for (i = 1; i <= 9; i++) {
			j = 1;
			do {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j += 1;
			} while (j <= 9);
			System.out.println();
		}
	}

	public static void ninenine3() {
		int i = 1, j = 1;
		while (i <= 9) {
			j = 1;
			do {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j += 1;
			} while (j <= 9);
			System.out.println();
			i += 1;
		}
	}

	public static void main(String[] args) {

		ninenine3();

		System.out.println("-------------------------------------------------------------------------");
		ninenine2();

		System.out.println("-------------------------------------------------------------------------");
		ninenine();
	}
}