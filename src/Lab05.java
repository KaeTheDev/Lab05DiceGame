import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Random;
import java.util.Scanner;

public class Lab05 {
    static Random random;
    static int dieOne;
    static int dieTwo;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        random = new Random();

        int dieSides = 0;
        String rollAgain = "";

        System.out.println("Welcome to the Grand Circus Casino!");
        System.out.println();

       do {
           System.out.println();
           System.out.print("How many sides should each die have? (numerical): ");
           dieSides = scan.nextInt();
           scan.nextLine();

           System.out.println("Roll *NUM HERE* ");

           System.out.println();

           randomNumbers(dieSides);

           System.out.println(dieOne);
           System.out.println(dieTwo);
           System.out.println();

           int diceTotal = dieOne + dieTwo;

           System.out.println("The total of the dice is: " + diceTotal);
           System.out.println();

           System.out.print("Roll Again? (y/n: ");

           rollAgain = scan.nextLine();
       }while(rollAgain.equalsIgnoreCase("y"));
    }

    // METHOD HERE

    public static int randomNumbers(int a)
    {
        int dieSides = a;

        dieOne = random.nextInt(dieSides);
        dieTwo = random.nextInt(dieSides);

        return a;
    }
} //END OF MAIN
