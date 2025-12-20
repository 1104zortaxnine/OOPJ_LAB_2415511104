import java.util.Scanner;
public class LAB1_Q3 {
    public static void main(String[] args) {
        int date;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the date:");

        date = sc.nextInt();

        switch (date % 7) {
            case 0:
                System.out.println("SUNSAY");
                break;

            case 1:
                System.out.println("MONDAY");
                break;

            case 2:
                System.out.println("TUESDAY");
                break;

            case 3:
                System.out.println("WEDNESDAY");
                break;

            case 4:
                System.out.println("THURSDAY");
                break;

            case 5:
                System.out.println("FRIDAY");
                break;

            case 6:
                System.out.println("SATURDAY");
                break;

            default:
                System.out.println("Invalid day");


        }
    }
}