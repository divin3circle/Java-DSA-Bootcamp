import java.util.Scanner;

public class Fibb {
    //the next number in a series is a sum of the
    //previous two numbers

    //Q: find the nth fibb number
    //we know hoe many times the loop is to run - 7
    //thus we use a for loop
    public int findFibb(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the end point: ");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;

        for(int i = 2; i < n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        return c;

    }
}
