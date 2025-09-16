import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {

        Scanner yourAge = new Scanner(System.in);

        System.out.println("Enter your age using numbers: ");
        int age = yourAge.nextInt();

        int ageA = 100 - age;
        System.out.println("You should read at least " + ageA + " pages before giving up a book.");

        yourAge.close();
    }
}

