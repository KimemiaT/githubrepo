import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        //using arrays
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
        //initializing arrays
        int[]code={111,222,333};
        String[]names={"John","Jane","Jack"};
        //get user input using scanner
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ID NUMBER:");
        int idNo=sc.nextInt();
        //use if statement to compare user input and code array content
        if (idNo==code[0]){
            System.out.println(greeting+" "+names[0]);
        }
        if (idNo==code[1]){
            System.out.println(greeting+" "+names[1]);
        }
        if (idNo==code[2]){
            System.out.println(greeting+" "+names[2]);
        }
    }
}