import java.util.Scanner;

public class abramyan {
    public static void main(String[] args) {
        /*task15 Дано вещественное число A и целое число N (>0). Найти A в степе-
ни N:
AN = A·A·...·A*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number A");
        int b = 1;
        int a = scanner.nextInt();
        System.out.println("Enter number n");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            b = b * a;
        }
        System.out.println(b);
    /*For19◦. Дано целое число N (> 0). Найти произведение
            (целое число).
    N! = 1·2·...·N
            (N–факториал). Чтобы избежать целочисленного переполнения, вычис- лять это произведение с помощью вещественной переменной и вывести
    его как вещественное число.*/

        System.out.println("Enter number ");
        int fact=1, x=scanner.nextInt();
        for (int i = 1; i <=x; i++)
            fact*=i;
        System.out.println(fact);
    }
}

