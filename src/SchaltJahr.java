import java.util.Scanner;
public class SchaltJahr {

	public static void main(String[] args) {
		System.out.println("Jahr: ");
		Scanner ConsoleIn = new Scanner(System.in);
		int jahr = ConsoleIn.nextInt();
		Jahr(jahr);
	}
	public static void Jahr( int jahr) {
		
			if(jahr%100 == 0 && jahr%4 == 0) {
				System.out.println(jahr + ": kein Schaltjahr");
			}
			if(jahr%4 == 0 ) {
				System.out.println(jahr + ": Schaltjahr");
			}
			if(jahr%4 == 0 && jahr%400 == 0) {
				System.out.println(jahr + ": Schaltjahr");
			}
			else if (jahr%100 == 0 && jahr%4 == 0) {
				System.out.println(jahr + ": kein Schaltjahr");
			}
			else {
				System.out.println(jahr + ": kein Schaltjahr");
			}
		
	}
}
