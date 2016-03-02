package nyc.c4q.lighterletter.com.company;
import javax.xml.bind.SchemaOutputResolver;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String [] Arr = new String[12];

        Arr[0]= "first";
        Arr[1]= "second";
        Arr[2]= "third";
        Arr[3]= "fourth";
        Arr[4]= "fifth";
        Arr[5]= "sixth";
        Arr[6]= "seventh";
        Arr[7]= "eight";
        Arr[8]= "ninth";
        Arr[9]= "tenth";
        Arr[10]= "eleventh";
        Arr[11]= "twelfth";

        HashMap<String, String> map = new HashMap<String, String>();

        map.put("first","A Partridge in a Pear Tree");
        map.put("second","Two Turtle Doves");
        map.put("third","Three French Hens");
        map.put("fourth","Four Calling Birds");
        map.put("fifth","Five Golden Rings");
        map.put("sixth","Six Geese a-Laying");
        map.put("seventh","Seven Swans a-Swimming");
        map.put("eight","Eight Maids a-Milking");
        map.put("ninth","Nine Ladies Dancing");
        map.put("tenth","Ten Lords a-Leaping");
        map.put("eleventh","Eleven Pipers Piping");
        map.put("twelfth","Twelve Drummers Drumming");


        System.out.println("On the first day of Christmas my true love gave to me;");
        System.out.println(map.get("first"));
        System.out.println();

        for (int i = 1; i < 12; i++) {

            String verse = "On the " + Arr[i] + " day of Christmas my true love gave to me;";
            System.out.println(verse);

                for (int j = i; j >= 0; j--) {

                    if(j == 0){
                        System.out.println("and "+map.get(Arr[j]));
                        System.out.println();
                    } else
                    System.out.println(""+map.get(Arr[j]));
                }
        }
    }
}

