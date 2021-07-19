import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        factorial();


    }

    public static void factorial() {
        System.out.println("Enter number");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num > 1) {
            int value = 1;
            for (int f = num; f >= 1; f--) {
                if(f == 1)
                    break;
                value *= f;

            }
            System.out.println(value);
        }
        else if(num == 0 || num == 1){
            System.out.println(1);
        }

    }

}
