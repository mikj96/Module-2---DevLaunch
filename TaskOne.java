import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TaskOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give specific number");
        int number = Integer.parseInt(sc.nextLine());
        if (number > 0) {
            System.out.println("Your number is higher than 0");
        } else {
            System.out.println("Your number is lower than 0");
        }
    }
}
