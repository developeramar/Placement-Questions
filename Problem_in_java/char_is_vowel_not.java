package Problem_in_java;
import java.util.Scanner;

public class char_is_vowel_not {
   
    public static void main(String[] args) {
        
        System.out.println("Enter a character --");
        Scanner sc =new Scanner(System.in);
        char c  =sc.next().charAt(0);


        if(c=='a' || c=='e' || c=='i' || c =='o' || c=='u' ||c=='A' || c=='E' ||c=='I'|| c=='O' || c=='U'){
            System.out.println("Character is Vowel");
        }
        else {
            System.out.println("Character Consonenta");
        }


        


    }
}
