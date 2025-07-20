package service;
import java.util.Scanner;

public class CheckPassword {


 public String checkPassword(){
    int score = 0;
    Scanner sc = new Scanner(System.in);
    String password;
    int length = 0;

    System.out.println("\n=================================");   
    System.out.println("     Paste Your Password Here     ");   
    System.out.println("==================================\n"); 
    while (true) {
    System.out.print(">     "); 
    password = sc.nextLine();
    if(!password.isEmpty()){
        if(password.length() >= 8){
            break;
        }
    System.out.println("Password must be at least 8 characters!\n");
    continue;
    }  
    System.out.println("Field can't be empty!!\n");
    continue;
    }

if (password.matches(".*[A-Z].*")) {
score += 1;
}

if (password.matches(".*[a-z].*")) {
score += 1;
}

if (password.matches(".*[0-9].*")) {
score += 1;
}

if (password.matches(".*[^a-zA-Z0-9].*")) {
score += 1;
}

if (password.length() >= 8) {
score += 1;
}

 String message;
 String color;
 switch (score) {
    case 5:
        message = "Very Strong Password";
        color = "\u001B[32m"; // Green
        break;
    case 4:
        message = "Strong Password";
        color = "\u001B[34m"; // Blue
        break;
    case 3:
        message = "Moderate Password";
        color = "\u001B[33m"; // Yellow
        break;
    default:
        message = "Weak Password";
        color = "\u001B[31m"; // Red
        break;
 }

 return color + "\nPassword Length: " + password.length() + 
       " | Password Strength: " + message + "\u001B[0m";


}
 
}
