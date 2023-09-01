import java.nio.channels.ScatteringByteChannel;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram_Check {
 
    // if another string will have same character like before one then i will called as this character is Anagram

    public static void main(String[] args) {
        
        String str1,str2;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter first String --" );
        
        str1 =sc.nextLine();
        System.out.println("Enter Second String --" );
        str2=sc.nextLine();

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();


        if(str1.length() == str2.length()){

        char str1array [] = str1.toCharArray();
        char str2array [] = str2.toCharArray();

        Arrays.sort(str1array);
        Arrays.sort(str2array);

        boolean result = Arrays.equals(str1array , str2array);

        if(result){
            System.out.println("Given Strings are Anagram");
        }
        else{
            System.out.println("The given String is not Anagram ");
        }

        }

        else{
            System.out.println("Their is not same String length ");
        }


    }
}
