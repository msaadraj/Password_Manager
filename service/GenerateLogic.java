package service;
import java.util.Random;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class GenerateLogic {

    public String generate(int user) {
        int length;

        switch (user) {
            case 1:
                length = 8;
                break;
            case 2:
                length = 10;
                break;
            case 3:
                length = 12;
                break;
            case 4:
                length = 14;
                break;
            default:
                return "Invalid option selected.";
        }

        // Define character pools
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String specialChars = "!@#$%^&*()-_=+<>?";

        // Combine all characters
        String allChars = upperCase + lowerCase + digits + specialChars;

        Random random = new Random();
        List<Character> password = new ArrayList<>();

        password.add(upperCase.charAt(random.nextInt(upperCase.length())));
        password.add(lowerCase.charAt(random.nextInt(lowerCase.length())));
        password.add(digits.charAt(random.nextInt(digits.length())));
        password.add(specialChars.charAt(random.nextInt(specialChars.length())));

        for (int i = 4; i < length; i++) {
            password.add(allChars.charAt(random.nextInt(allChars.length())));
        }

        Collections.shuffle(password);

        StringBuilder finalPassword = new StringBuilder();
        for (char ch : password) {
            finalPassword.append(ch);
        }

        return "\nLength: " + length + " | Password: " + finalPassword;
    }
}
