package Problem_in_java;
import java.util.Locale;
import java.util.Scanner;

public class Identify_char_Alphabet_or_not {

    
    
    public static void main(String[] args) {
        


        char c;
        System.out.println("Enter any Character --");
        Scanner sc =new Scanner(System.in);

        c=sc.next().charAt(0);

        if((c >='a' && c <='z') || (c >='A' && c <='Z' )){

            System.out.println("This Character is Alphabet");

        } 
        else{
            System.out.println("This is not Alphabet");
        }

        

    }
}
