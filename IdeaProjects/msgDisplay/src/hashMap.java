import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class hashMap {
    public static void main(String[] args)
    {
        //using HashMaps
        //get current time
        Date date=new Date();
        Calendar c = Calendar.getInstance();
        int time = c.get(Calendar.HOUR_OF_DAY);

        //if statements to set the greetings according to the time
        String greeting=null;
        if (time >=0 && time <=11){
            greeting="Good Morning";
        }
        if (time >=12 && time <=15){
            greeting="Good Afternoon";
        }
        if (time >=16 && time <=20){
            greeting="Good Evening";
        }
        if (time >=21 && time <=23){
            greeting="Good Night";
        }
        //initializing hashmap
        HashMap<Integer ,String> hash =new HashMap<Integer, String>();
        hash.put(111,"Joe");
        hash.put(222,"Jane");
        hash.put(333,"Jack");

        //get user input using scanner
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter NAME:");
       String name=sc.next();

        //use if statement to compare user input and hashmap content
       if (hash.get(111).equals(name)){
            System.out.println(greeting+" "+hash.get(111));
        }
        if (hash.get(222).equals(name)){
            System.out.println(greeting+" "+hash.get(222));
        }
        if (hash.get(333).equals(name)){
            System.out.println(greeting+" "+hash.get(333));
        }

    }
}
