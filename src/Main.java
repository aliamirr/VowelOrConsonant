import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the letter");
        char l = inp.next().charAt(0);

        if( l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u' || l == 'A' || l == 'E' || l == 'I' || l == 'O' || l == 'U') {
            System.out.println("The entered alphabet is an vowel.");
        } else {
            System.out.println("The entered alphabet is a consonant.");
        }

    }
    }