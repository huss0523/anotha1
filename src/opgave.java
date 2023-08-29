import java.util.Scanner;

public class opgave {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter athlete's name: ");
        String athleteName = keyboard.nextLine();
        System.out.println("Enter total number of seconds (as a double):");
        double totalSeconds = keyboard.nextDouble();
        System.out.println("Enter total number of meters (as a double): ");
        double totalMeters = keyboard.nextDouble();

        // Chatgpt version
        int seconds = (int) totalSeconds;  // Extract the integer part of seconds
        int milliseconds = (int) ((totalSeconds - seconds) * 1000);  // Extract milliseconds

        int meters = (int) totalMeters;
        int cm = (int) ((totalMeters - meters) * 100);

        System.out.printf("Stats of the athlete %s%n", athleteName.toUpperCase());
        System.out.printf("Time: %d seconds and %d milliseconds%n", seconds, milliseconds);
        System.out.printf("Distance: %d meters and %d cm ", meters, cm);



    }
}

//my version
//totalSeconds =
        //System.out.printf("Stats of the athlete %s",athleteName.toUpperCase());
       // System.out.printf("%nTime: %d seconds and %d miliseconds")
      //  System.out.printf("%nNumber of meters: ");