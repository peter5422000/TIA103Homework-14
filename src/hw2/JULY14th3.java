package hw2;

public class JULY14th3 {
	public static void main(String[] args) {

		lotary();
		System.out.println("------------------------------------");
		pyramid();
		System.out.println("------------------------------------");
		pyramidA();

	}

	public static void lotary() {
		int i = 1, count = 0;
		while (i <= 49) {
			if (i / 10 != 4 && i % 10 != 4) {
				System.out.print(i + " ");
				count += 1;

			}
			i++;
		}
		System.out.println();
		System.out.println(count);
	}

	public static void pyramid() {
		int i = 1, j;
		for (j = 10; j >= 0; j--) {
			while (i <= j) {
				System.out.print(i);
				i++;
			}
			i = 1;
			System.out.println();
		}

	}

	public static void pyramidA() {
		char uni = 65;
		for (int i = 1; i <= 6; i++) {
			int count = uni;
			while (count - 65 >= 0) {

				System.out.print(uni);
				count--;
			}
			System.out.println();
			uni += 1;
		}

	}

}
