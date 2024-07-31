import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner n1 = new Scanner(System.in);
        Scanner n2 = new Scanner(System.in);
        Scanner n3 = new Scanner(System.in);
        Scanner n4 = new Scanner(System.in);
        Scanner n5 = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int first = n1.nextInt();
        int minimum = first;
        System.out.println("Enter second number: ");
        int second = n2.nextInt();
        if (second < minimum) {
            minimum = second;
        }
        System.out.println("Enter third number: ");
        int third = n3.nextInt();
        if (third < minimum) {
            minimum = third;
        }
        System.out.println("Enter fourth number: ");
        int fourth = n4.nextInt();
        if (fourth < minimum) {
            minimum = fourth;
        }
        System.out.println("Enter fifth number: ");
        int fifth = n5.nextInt();
        if (fifth < minimum) {
            minimum = fifth;
        }
        System.out.println("Lowest number is: " + minimum);



    }
}
