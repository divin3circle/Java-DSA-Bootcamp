import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Salary  Coders = new Salary();
        Prime prime = new Prime();
        Scanner input = new Scanner(System.in);
        System.out.println(input.nextInt());
 int samSalary = Coders.printSalary(50000);
        System.out.println(samSalary);
        System.out.println(prime.isPrime(23111147));
        }
    }
