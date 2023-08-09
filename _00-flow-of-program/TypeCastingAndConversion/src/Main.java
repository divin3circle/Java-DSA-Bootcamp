import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //float is greater than int values
        //destination must be greater than the provided value
        // i.e. int num = input.nextFloat() will not work
        //but float num = input.nextInt() will because float > int
        // for automatic type conversion

        //type casting - incompatible types, narrowing conversion
        /* int num = (int)(6.7f);
        System.out.println(num);*/
        //automatic type promotion in expressions
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 108888;
        double d = 0.12345698;
        float f = 5.67f;

        double result = (f * b) + (c / i) - (d - s);
        System.out.println(result);
        System.out.println(( f * b) + " + " + (i / c) + " - " + (d - s) + " = " + result);


    }
}