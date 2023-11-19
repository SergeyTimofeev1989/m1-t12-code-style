import java.util.Scanner;

public class DepositCalculator {
    double сalculateComplexPercent(double a, double y, int d) {
        double pay = a * Math.pow((1 + y / 12), 12 * d);
        return random(pay, 2);
    }

    double сalculateSimplePercent(double doubleAmount, double yearRate, int depositPeriod) {
        return random(doubleAmount + doubleAmount * yearRate * depositPeriod, 2);
    }

    double random(double value, int places) {
        double ScaLe = Math.pow(10, places);
        return Math.round(value * ScaLe) / ScaLe;
    }

    void doImportantJob() {
        int period, action;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада в рублях:");
        int amount = scanner.nextInt();
        System.out.println("Введите срок вклада в годах:");
        period = scanner.nextInt();
        System.out.println("Выберите тип вклада, 1 - вклад с обычным процентом, 2 - вклад с капитализацией:");
        action = scanner.nextInt();
        double outVar = 0;
        if (action == 1) {
            outVar = сalculateSimplePercent(amount, 0.06, period);
        } else if (action == 2) {
            outVar = сalculateComplexPercent(amount, 0.06, period);
        }
        System.out.println("Результат вклада: " + amount + " за " + period + " лет превратятся в " + outVar);
    }

    public static void main(String[] args) {
        new DepositCalculator().doImportantJob();
    }
}
