/* Mohammed Qutu
 * 4/6/24
 * 21.0.2; Java HotSpot(TM) 64-Bit Server VM 21.0.2+13-LTS-58
 */
import java.util.Scanner;

public class EmailValidatorApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your email address:");
        String email = scanner.nextLine();

        if (isValidEmail(email)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }

    public static boolean isValidEmail(String email) {
        if (email.length() < 15 || email.length() > 25) {
            return false;
        }

        if (!email.contains("@")) {
            return false;
        }

        boolean hasNumber = false;
        for (char c : email.toCharArray()) {
            if (Character.isDigit(c)) {
                hasNumber = true;
                break;
            }
        }

        return hasNumber;
    }
}
