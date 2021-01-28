package TasksOnJava;
import java.util.Scanner;
public class Calculator {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int a = getInt();
        int b = getInt();
        char operation = getOperation();
        int result = calc(operation,a,b);
        System.out.print(result);


    }
    public static int getInt () {
        System.out.print("Pls,enter a number");
        int a;
        if (scan.hasNextInt()) {
            a = scan.nextInt();
        } else
        {
            System.out.print("Pls, enter an integer number again");
            scan.next();
            a = getInt();
        }
        return a;
    }

    public static char getOperation () {
        System.out.print("Pls,enter the operator to these numbers");
        char operation;
        if (scan.hasNextLine()) {
            operation = scan.nextLine().charAt(0);
        } else
        {
            System.out.print("Pls,enter an operator");
            scan.nextLine();
            operation = scan.nextLine().charAt(0);
        }
        return operation;

    }

    public static int calc (char operation,int a,int b) {
            int res;
            switch(operation) {
                case '+': res =  a +  b; break;
                case '-': res =  a -  b; break;
                case '*': res =  a *  b; break;
                case '/': res =  a / b; break;
                default:
                    System.out.print("The operation is not identified");
                    res = calc(getOperation(),a,b);

            }
            return res;

    }



}
