
public class TemperaturMittelWert {

	public static void main(String[] args) {
		int[] temp = new int[1000]; 
		// 0 bis 40° 
		for(int i = 0;i<temp.length;i++) {
			temp[i] = (int) (Math.random()*41);
			System.out.println(temp[i]);
		}
		// temperaturen unter 10°
		int vorkommenunter10 = 0;
		int vorkommenunter20 = 0;
		int vorkommengroesser20 = 0;
		for(int i = 0; i<temp.length;i++) {
			if(temp[i] <= 10) {
				vorkommenunter10++;
			}
			if(temp[i] > 10 && temp[i] < 20) {
				vorkommenunter20++;
			}
			if(temp[i] >= 20 ) {
				vorkommengroesser20++;
			}
		}
	System.out.println("Unter 10°: "+vorkommenunter10 + "x");
	System.out.println("Zwischen 20° und 10° : "+vorkommenunter20 + "x");
	System.out.println("Zwischen 20° und 10° : "+vorkommengroesser20 + "x");
	System.out.println("1000 = "+(vorkommenunter10 + vorkommenunter20+vorkommengroesser20));
	}

}
