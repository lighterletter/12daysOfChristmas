package nyc.c4q.lighterletter.com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String [] anArray;
        anArray = new String[12];

        anArray[0]= "first";
        anArray[1]= "second";
        anArray[2]="third";
        anArray[3]="fourth";
        anArray[4]="fifth";
        anArray[5]="sixth";
        anArray[6]="seventh";
        anArray[7]="eight";
        anArray[8]="ninth";
        anArray[9]="tenth";
        anArray[10]="eleventh";
        anArray[11]="twelfth";


        String dayOf = "first";
        String verse = "On the " + anArray + "day of Christmas my true love gave to me;";
        String verse2 = "day of Christmas my true love gave to me;";

        String gift = "And a piper in a pear tree.";
        String sentence = verse + gift;
        for (i = 0; i < 12; i = i + 1) {


            System.out.printf(sentence);
            System.out.println();
            /*Scanner input = new Scanner(System.in);
            System.out.println("Enter a line of text:");
            String line = input.nextLine();
            System.out.println("You entered:" + line);*/
        }
    }
}

