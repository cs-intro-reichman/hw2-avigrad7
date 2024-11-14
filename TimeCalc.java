public class TimeCalc {
    public static void main(String[] args) {
        String hoursMins = args[0];
        int minsToAdd = Integer.parseInt(args[1]);
        int hours = Integer.parseInt(hoursMins.substring(0, 2));
        int mins = Integer.parseInt(hoursMins.substring(3));

        int totalTimeInMins = (hours * 60) + mins + minsToAdd;
        
        int finalMins = totalTimeInMins % 60;
        totalTimeInMins /= 60;
        int finalHours = totalTimeInMins % 24;

        if (finalHours < 10) {
            System.out.print(0);
        }
        System.out.print(finalHours + ":");
        if (finalMins < 10) {
            System.out.print(0);
        }
        System.out.println(finalMins);
    }
}
