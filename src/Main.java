import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int numWeeks=0;
        boolean flag;

        do
        {
            try
            {
                Scanner scan = new Scanner(System.in);
                System.out.print("Enter number of weeks: ");
                numWeeks=scan.nextInt();
                flag=false;
            }
            catch(Exception error)
            {

                System.out.println("Please enter an integer value");
                flag=true;
            }
        }
        while(flag);

        int days = numWeeks * 7;
        System.out.println(days + " " + "days.");
        int hours = days * 24;
        System.out.println(hours + " " + "hours.");
        int minutes = hours * 60;
        System.out.println(minutes + " " + "minutes.");
        int seconds = minutes * 60;
        System.out.println(seconds + " " + "seconds.");

    }
}    