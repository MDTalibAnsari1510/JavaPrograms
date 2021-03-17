import java.util.Scanner;
public class Weeks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no;
        do {
            System.out.print("Enter a day 0 to 6: ");
            int Day= sc.nextInt();
            switch (Day) {
                case 0 -> System.out.print("Sunday");
                case 1 -> System.out.print("Monday");
                case 2 -> System.out.print("Tuesday");
                case 3 -> System.out.print("Wednesday");
                case 4 -> System.out.print("Thursday");
                case 5 -> System.out.print("Friday");
                case 6 -> System.out.print("saturday");
                default -> System.out.print("Enter the valid input");
            }
            System.out.print("\nDo you want continue \nPress 1 otherwise press any key");
            no= sc.nextInt();
        }while (no==1);
        System.out.println("Exit the program");
    }
}
