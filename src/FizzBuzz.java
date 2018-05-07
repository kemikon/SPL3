public class FizzBuzz {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			FizzBuzz(i);
		}
	}

	public static void FizzBuzz(int i) {

		if (i % 7 == 0 && i % 4 == 0) {
			System.out.println("Fizzer!Buzzer!");
		} else if (i % 4 == 0) {
			System.out.println("Fizzer!");
		} else if (i % 7 == 0) {
			System.out.println("Buzzer!");
		} else if (i % 4 != 0 && i % 7 != 0) {
			System.out.println(i);
		}
	}
}
