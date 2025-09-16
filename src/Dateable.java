import java.util.Scanner;

public class Dateable {

    public static void main(String[] args) {
        Scanner yourAge = new Scanner(System.in);

        System.out.println("Enter your age using numbers: ");
        int age = yourAge.nextInt();
        double age1 = ((double)age / 2) + 7;
        System.out.println("Your should date someone who is at least " + age1 + " years old.");

        yourAge.close();

    }
}