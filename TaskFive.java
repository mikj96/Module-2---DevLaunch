import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        if (num >= 0){
            for (int i = 0; i <= num; i = i +1) {
                System.out.println(i);;
        }
        }else{
                System.out.println("Invalid number");
            }

        }
    }
