import service.CheckPassword;
import service.GenerateLogic;
import java.util.Scanner;
import java.util.InputMismatchException;

public class PasswordGenerater {
    private static Scanner sc;
    private String password;

    public static int inputValidate(String p1,Scanner sc, int options){
    int user = 0;
    while (true) {
    try {
    System.out.print(">     ");
    user = sc.nextInt();
    if(user > 0 && user < options){
    return user;
    }
    System.out.println(p1);
    continue;
    } catch (InputMismatchException e) {
    System.out.println(p1);
    sc.next();
    continue;
    }
    }
    }

    public int option2(){          // Password Generater
    GenerateLogic g = new GenerateLogic();
    System.out.println("\n===========================================");   
    System.out.println("     Select Length to Generate Password     ");   
    System.out.println("============================================\n"); 
    System.out.println("1)Length 8\n2)Length 10\n3)Length 12\n4)Length 14\n5)Back\n");
    String p1 = "Invalid Input, Enter only given option\n";
    int options = 6;
    int user = inputValidate(p1,sc, options);

    if(user == 1 || user == 2 || user == 3 || user == 4){
    password = g.generate(user);
    System.out.println(password);
    }
    return user;
    }

    public static void main(String[] args){
    sc = new Scanner(System.in);
    PasswordGenerater p = new PasswordGenerater();
    CheckPassword c = new CheckPassword();

    while (true) {
    System.out.println("\n=====================================");   
    System.out.println("     Welcome to Password Manager     ");   
    System.out.println("=====================================\n");
    System.out.println("1)Password Checker\n2)Password Generator\n3)Exit\n");
    int getLength = 0;
    String p1 = "Invalid Input, Enter only given option\n";
    int options = 4;
    int user = inputValidate(p1,sc, options);

    if(user == 1){
    String message = c.checkPassword();
    System.out.println(message);
    continue;
    }
    else if (user == 2){
    getLength=p.option2();
    continue;
    }
    else{
    System.exit(0);
    }   
    }      
    }
    }

