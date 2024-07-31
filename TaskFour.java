import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int height = sc.nextInt();
        if (height <= 0) {
            System.out.println("Triangle height must be larger than 0.");
            return;
        }

        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
