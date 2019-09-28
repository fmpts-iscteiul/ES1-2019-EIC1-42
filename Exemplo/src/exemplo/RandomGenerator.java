package exemplo;

public class RandomGenerator {

	
	public static int generate(int n) {
		double m = Math.random();
		double t = 1.0;
		double n2 = (double) n;
		
		double count = 0.0;
		double contador = 0;
		while(count<1) {
			count = count + t/n2;
			contador = contador + 1;
			if(count > m ) {
				return (int) contador;
			}
		}
		return -1;
		
	}
}
