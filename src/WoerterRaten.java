import java.util.Scanner;
public class WoerterRaten {

	public static void main(String[] args) {
		System.out.println("Geben bitte ein Wort ");
		Scanner ConsoleIn = new Scanner(System.in);
		String Wort  = ConsoleIn.next();
		int laenge = 0;	
		laenge(Wort, laenge);
	
		
			
		
		
	}

	public static void laenge(String Wort, int laenge) {
		char[] laengeDesWortes = Wort.toCharArray();
		laenge  = laengeDesWortes.length;
		System.out.println("Das Wort hat " + laenge + " Buchstaben");
		char[] Sterne = new char[laenge];
		for(int i = 0;i<Sterne.length; i++) {
			Sterne[i] = '*';
			System.out.print(Sterne[i]);
		}
		String unknown = Sterne.toString();
		
		while(Wort == unknown) {
		System.out.println("Bitte eine Buchstabe eingeben: ");
		Scanner ConsoleIn = new Scanner(System.in);
		char Buchstabe  = ConsoleIn.next();
		char[] wort = Wort.toCharArray();
		for(int i = 0; i<Wort.length(); i++) {
			if(Buchstabe == wort[i]) {
				
			}
		}
		}
	}
	
	

}
