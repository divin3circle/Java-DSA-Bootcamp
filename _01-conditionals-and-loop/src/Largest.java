import java.util.Scanner;

public class Largest {
    public int largestNumber(){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();


/*
        if(a > b && a > c){
            return a;
        } else if (b > a && b > c) {
            return b;
        }else{
            return  c;
        }*/

        //We can also use the Math.max method
        return Math.max(c, Math.max(a, b));
    }
}
