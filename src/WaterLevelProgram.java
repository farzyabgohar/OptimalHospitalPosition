//Farzyab Gohar
//101021301
import java.util.Scanner;

public class WaterLevelProgram {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        while (!((c < b) && (b < a))) //checks if the following water levels after the first one (the next two inputs) are decreasing. if not, the loop continues to run until water level is decreasing
        {
            // get user input for water level

            Scanner keyboard = new Scanner(System.in);
            System.out.print("What is the water level at now (in mm): ");
            a = keyboard.nextInt();
            System.out.print("What is the water level at now (in mm): ");
            b = keyboard.nextInt();
            System.out.print("What is the water level at now (in mm): ");
            c = keyboard.nextInt();
        }
        System.out.println();
        System.out.print("It appears that the flood is subsiding.");

    }
}
