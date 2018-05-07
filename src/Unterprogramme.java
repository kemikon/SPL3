
public class Unterprogramme {

	public static void main(String[] args) {
		String text  = "Heute ist ein schöner Tag";
		
		
		char[] z  = text.toCharArray();
		zeichenZaehlen(z, 'e');
		zeichenZaehlen(z, 'i');
		zeichenZaehlen(z, 'o');
	
		System.out.println(anzahlZeichen(z, 'e'));
		System.out.println(anzahlZeichen(z, 'i'));
		System.out.println(anzahlZeichen(z, 'o'));
		
	}
	
	public static void zeichenZaehlen(char[] z, char x) {
		int counter = 0;
		for(char i: z ) {
			if(i == x) {
				counter++;
			}
		}
		System.out.println("Anzahl" + x + " 's im Text: " + counter);
	}
	public static int anzahlZeichen(char[] z, char x) {
		int counter = 0;
		for(char i: z ) {
			if(i == x) {
				counter++;
			}
		}
	return counter;
	}
}
