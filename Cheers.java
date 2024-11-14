// Prints a crowd cheering output.
public class Cheers {
    public static void main(String[] args) {
        String word = args[0];
        int howManyTimes = Integer.parseInt(args[1]);

        for (int i = 0; i < word.length(); i++) {
            System.out.print("Give me a");
            if (needsAnN(word.charAt(i))) {
                System.out.print("n");
            } 
            System.out.println(" " + word.charAt(i) + ": " + word.charAt(i) + "!");
        }
        
        System.out.println("What does that spell?");

        for (int i = 0; i < howManyTimes; i++) {
            System.out.println(word + "!!!");
        }
    }

    /**
     * Checks if a given letter would need the previous word "a" to be changed to "an"
     * 
     * @param letter The letter to check
     * @return The boolean value of if the previous word "a" has to be changed to "an"
     */
    public static boolean needsAnN(char letter) {
        char[] letters = {'A', 'E', 'F', 'H', 'I', 'L', 'M', 'N', 'O', 'R',
        'S', 'X'};
        for (int i = 0; i < letters.length; i++) {
            if (letter == letters[i]) {
                return true;
            }
        }
        return false;
    }
}
