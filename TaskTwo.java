import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner n1 = new Scanner(System.in);
        Scanner n2 = new Scanner(System.in);
        Scanner n3 = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = n1.nextInt();
        if (a>0){
            System.out.println("Number a is higher than 0");
        }
        System.out.println("Enter the second number: ");
        int b = n2.nextInt();
        if (b>0){
            System.out.println("Number b is higher than 0");
        }
        System.out.println("Enter the third number: ");
        int c = n3.nextInt();
        if (c>0){
            System.out.println("Number c is higher than 0");
        }
        int average = (a+b+c)/3;
        System.out.println("The average is " + average);

    }
}
