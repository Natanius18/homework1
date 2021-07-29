import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println("");
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи число: ");
        int limit = scanner.nextInt();
        for (int i = 1; i <= limit; i++) {
            sum+=i;
        }
        System.out.println("Сумма чисел от 1 до " + limit + " равна "+ sum);
    }
}
