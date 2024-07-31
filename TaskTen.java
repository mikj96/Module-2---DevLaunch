import java.util.Scanner;

public class TaskTen {
    public static void main(String[] args) {
        userManual();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        float n1 = sc.nextFloat();
        System.out.println("Enter number 2 : ");
        float n2 = sc.nextFloat();


        performCalculation(sc, n1, n2);

    }
        public static void performCalculation (Scanner sc, float n1, float n2) {
            System.out.println("Enter operation (+ , - , * , /): ");
            String operation = sc.next().trim();
            if (operation == "+") {
                System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
            }else if (operation == "-") {
                System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
            }else if (operation == "*") {
                System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
            }else if (operation == "/") {
                System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
            }else {
                System.out.println("Operation not recognized");
            }
            continueCalculating(sc, n1, n2);
        }
        private static void continueCalculating(Scanner sc, float n1, float n2){
            System.out.println("Do you want to continue? Y/N ");
            String answer = sc.next();
            if (answer.equals("Y")) {
                System.out.println("Enter first number : ");
                n1 = sc.nextFloat();
                System.out.println("Enter second number: ");
                n2 = sc.nextFloat();
                performCalculation(sc, n1, n2);
            }else if (answer.equals("N")) {
                System.out.println("Thanks for using");
            }else{
                System.out.println("Operation not recognized");
            }

        }
        private static void userManual(){
        System.out.println("Welcome to mikJ's calculator in which you" +
                " can add, subtract, multiply and divide two numbers");
        System.out.println("To use simply type two float numbers and operation that " +
                " you would like to perform.");
        System.out.println("Operations availabe:");
        System.out.println("1. Addition = +");
        System.out.println("2. Subtraction = -");
        System.out.println("3. Multiplication = *");
        System.out.println("4. Division = /");
        System.out.println("Let's start with entering first number!");
        }




}
