// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		int howManyCalcs = Integer.parseInt(args[0]);

	    System.out.println("pi according to Java: " + Math.PI);
		int denominator = 1;
		double pi = 0;
		//Actual equation is pi/4 = 1 - 1/3 + 1/5 - 1/3 ...
		//Every other operation is + and then - so by % 2 I can switch every time
		for (int i = 0; i < howManyCalcs; i++) {
			if (i % 2 == 0) {
				pi += (double)1 / denominator;
			}
			else {
				pi -= (double)1 / denominator;
			}
			denominator +=2;
		}
		pi *= 4;

		System.out.println("pi, approximated:     " + pi);
	}
}
