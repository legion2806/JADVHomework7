import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CreditCalculator creditCalculator = new CreditCalculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сумму кредита: ");
        int general = scanner.nextInt();

        System.out.println("Введите срок, на который был выдан кредит в месяцах: ");
        int time = scanner.nextInt();

        System.out.println("Введите ставку по кредиту в процентах: ");
        int procent = scanner.nextInt();

        System.out.println("Ежемесячный платеж по кредиту: " +
                creditCalculator.calculateMonthPayment(general, time, procent));

        System.out.println("Общий размер суммы выплаты банку: " +
                creditCalculator.calculateGeneralSum(general, time, procent));

        System.out.println("Сумма переплаты: " +
                creditCalculator.calculateOverPayment(general, time, procent));

    }
}