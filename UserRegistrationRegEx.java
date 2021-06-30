import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Using regEx to validate First name, Last name, email, phone number and password
 * @author Tushar Akhade
 * @since 29 Jun 2021
 */
public class UserRegistrationRegEx {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        phoneNumberValidate();
        firstNameValidate();
        lastNameValidate();
        emailValidate();
        passwordValidate();
    }

    /**
     * First name must start with Capital letter and has minimum 3 length
     */
    public static void firstNameValidate() {
        System.out.print("Enter first Name : ");
        String firstName = scanner.next();
        System.out.println(Pattern.matches("[A-Z][a-z]{2,}", firstName));
    }

    /**
     * Last name must start with Capital letter and has minimum 3 length
     */
    public static void lastNameValidate() {
        System.out.print("Enter last Name : ");
        String lastName = scanner.next();
        System.out.println(Pattern.matches("[A-Z][a-z]{2,}", lastName));
    }

    /**
     * Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in) with precise @ and . positions
     * enter a valid email - E.g. abc.xyz@bl.co.in
     */
    public static void emailValidate() {
        String email = "abc.xyz@bl.co.in";
        System.out.println("Email : " + email);
        System.out.println(Pattern.matches("^(abc)[.][a-z]+[@](bl)[.](co)[.][a-z]+$", email));
    }

    /**
     * Phone number starts with 2 digit country code followed by space and 10 digit number
     */
    public static void phoneNumberValidate() {
        System.out.println("Enter mobile no. : ");
        String phNum = scanner.nextLine();
        System.out.println(Pattern.matches("[0-9]{2}[\s][0-9]{10}", phNum));
    }

    /**
     * Password contains minimum 8 characters, atleast 1 capital Letter, atleast 1 small Letter, atleast 1 numeric value and exact one Special character( like !@#$%^&+= )
     */
    public static void passwordValidate() {
        System.out.print("Enter password : ");
        String password = scanner.next();
        System.out.println(Pattern.matches("^(?=.*[A-Z])(?=.*[a-z])(?=[^!@#$%^&+=]*[!@#$%^&+=][^!@#$%^&+=]*$)(?=.*[0-9]).{8,}$", password));
    }
}
