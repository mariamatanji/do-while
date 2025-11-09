import java.util.Scanner;

public class ChallengeC {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String password;

        do {
            System.out.println("Enter the password: ");
            password = input.nextLine();
        } while (!password.equals("open"));

        System.out.println("Access granted!");
    }
}
