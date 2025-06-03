import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        double salary = sc.nextDouble();
        double newSalary, raise;
        int percentage;

        if (salary <= 400.00) {
            percentage = 15;
        } else if (salary <= 800.00) {
            percentage = 12;
        } else if (salary <= 1200.00) {
            percentage = 10;
        } else if (salary <= 2000.00) {
            percentage = 7;
        } else {
            percentage = 4;
        }

        raise = salary * percentage / 100.0;
        newSalary = salary + raise;

        System.out.printf("Novo salario: %.2f\n", newSalary);
        System.out.printf("Reajuste ganho: %.2f\n", raise);
        System.out.printf("Em percentual: %d %%\n", percentage);

        sc.close();
    }
}