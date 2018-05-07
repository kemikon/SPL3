public class FizzBuzz {
	public static void main(String[] args) {
		//for (int i = 1; i <= 100; i++) {
			//FizzBuzz(i);
		//}
		for(int i = 4; i<=100; i+=4) {
			FizzBuzz(i, false);
		}
	}

	public static void FizzBuzz(int i, boolean showFizzBuzz) {

		if (i % 7 == 0 && i % 4 == 0 && showFizzBuzz == true) {
			System.out.println("Fizzer!Buzzer!(" + i +")");
		} else if (i % 4 == 0) {
			System.out.println("Fizzer!(" + i +")");
		} else if (i % 7 == 0) {
			System.out.println("Buzzer!(" + i + ")");
		} else if (i % 4 != 0 && i % 7 != 0) {
			System.out.println(i);
		}
	}
}
