import java.util.Scanner;

public class dayDriver {
    public static void main (String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the current day of a week:");
        day day1=new day(scanner.next());
        System.out.println(day1.toString());
        System.out.println("The next day is "+day1.nextDay()+".");
        System.out.println("The previous day is "+day1.previousDay()+".");
        System.out.println("Enter the number of days to add to the current day:");
        int n=Integer.parseInt(scanner.next());
        System.out.println("The day is "+day1.addDays(n)+" in "+n+" days.");
    }
}

