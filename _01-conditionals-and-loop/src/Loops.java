import java.util.Scanner;

public class Loops {
    // Q: Print numbers from 1 to
    Scanner input = new Scanner(System.in);
    // Using For Loop
    public void forLoops() {
        System.out.println("**********Loops - FOR loop*********");
        System.out.println("Enter end point: ");

        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }

    //Using a while loop
    //used when we don't know how many times the loop will run
    //i.e. keep taking an input from a user until a particular
    //condition is meet
    public void whileLoop(){
        System.out.println("**********Loops - WHILE loop*********");
        System.out.println("Enter end point: ");
        int w = input.nextInt();
        int i = 1;
        while(i <= w){
            System.out.print(i + " ");
            i++;
        }

    }

    //Using a do while loop
    //Difference with the while loop, is that the loop
    //will execute at least once
    public void doWhileLoop(){
        System.out.println("**********Loops - DO-WHILE loop*********");
        System.out.println("Enter end point: ");
        int n = 1;
        int d = input.nextInt();
        do{
            System.out.print(n + " ");
            n++;
        } while (n <= d);

    }

}
