import java.util.Scanner;

public class CaseCheck {
    public boolean isUpper(){
        System.out.println("Enter a char to check if its upper case or lower: ");
        Scanner in = new Scanner(System.in);
        //trim() - removes all the extra spaces between the words
        //next() - reads the next string line
        //charAt(n) - return char at the index n
        char ch = in.next().trim().charAt(0);

        if(ch >= 'a' && ch <= 'z'){
            return false;
        }else {
            return true;
        }

    }

}
