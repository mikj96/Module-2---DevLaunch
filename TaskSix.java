import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int sum = 0;
        if (num >= 0){
            for (int i = 0; i <= num; i = i +1) {
                sum = sum + i;
                System.out.println(sum);
            }
        }else{
            System.out.println("Invalid number");
        }

    }
}
