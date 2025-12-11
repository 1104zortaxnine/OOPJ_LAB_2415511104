import java.util.Scanner;

public class LAB1_Q2
{
    public static void main(String arg[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER MARKS OBTAINED");
        int marks=sc.nextInt();
        System.out.println("marks entered "+marks);

        if ( marks <= 100 && marks >=90 ){
            System.out.println("GRADE: O");
        } else if( marks <90 && marks >=80){
            System.out.println("GRADE: E");
        } else if (marks<80 && marks >= 70){
            System.out.println("GRADE: A");
        }else if (marks<70 && marks>=60){
            System.out.println("GRADE: B");
        }else {
        System.out.println("GRADE: C");
        }
    }
}
