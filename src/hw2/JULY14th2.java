package hw2;

public class JULY14th2 {

	public static void evensum() {
		int i = 1, count = 0;
		for (i = 1; i <= 1000; i++) {
			if (i % 2 == 0) {
				count += i;
			}
		}
		System.out.println(count);

	}

	public static void mutiplied() {
		int i = 1, product = 1;
		for (i = 1; i <= 10; i++) {
			product *= i;
		}
		System.out.println(product);

	}

	public static void mutiplied2() {
		int i = 1, product = 1;
		while (i <= 10) {
			product *= i;
			i++;
		}
		System.out.println(product);

	}
	public static void squ() {
		int i = 1, square = 0;
		while (i <= 10) {
			square=i*i;
			System.out.println(square);
			i++;
		}
		

	}

	public static void main(String[] args) {
		evensum();

		System.out.println("------------------------------------");

		mutiplied();
		
		System.out.println("------------------------------------");
		
		mutiplied2();
		
		System.out.println("------------------------------------");
		
		squ();
	}
}
