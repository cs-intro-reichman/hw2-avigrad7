// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int howHigh = Integer.parseInt(args[0]);
		boolean verbose = args[1].equals("v");

		int count = 1;
		int seed = 0;

		//Because the proper output of the first one is 4 instead of 1 this line is necessary and I start at i = 2
		if (verbose) {
			System.out.println("1 4 2 1 (4)");
		}

		for (int i = 2; i <= howHigh; i++) {
			seed = i;
			while (seed != 1) {
				if (verbose) {
					System.out.print(seed + " ");
				}
				if (seed % 2 == 0) {
					seed /= 2;
				}
				else {
					seed = (seed * 3) + 1;
				}
				count++;
			}
			if (verbose) {
				//One always is the last number and is not printed above so it is added here
				System.out.println("1 (" + count + ")");
			}
			count = 1;
		}
		System.out.println("Every one of the first " + howHigh + " hailstone sequences reached 1.");
	}
}
