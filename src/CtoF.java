import java.util.Scanner;

public class CtoF
{

    public static void main(String[] args)
    {
        {
            Scanner in = new Scanner(System.in);
            int inputC = 0;
            String invalid = ""; //bad input will loop back
            double outputF;
            do {

                System.out.println("Enter the temperature in Celsius:"); //prompt user for temp in C
                if (in.hasNextInt()) {
                    inputC = in.nextInt();
                    outputF = (inputC * 1.8) + 32;
                    System.out.println("Your temperature in Fahrenheit is: " + outputF); //displays your temp in F
                    break;
                } else {
                    invalid = in.nextLine();
                    System.out.println("Your input was invalid. Please try again."); //tells the user input was invalid and to retry
                }
            } while (true);


        }
    }
}