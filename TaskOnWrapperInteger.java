package TasksOnJava;
/*
In the class TaskOnWrapperInteger there is a field balance, which describes
 a balance of funds in the bank account. Initialized by value Integer.MAX_VALUE during the declaration.
Create a method processPayment(String), which accepts a cheque and
execute a write-off of funds from the account according to cheque

 */
public class TaskOnWrapperInteger {
        public static Integer balance = Integer.MAX_VALUE;

        public static void main(String[] args) {
            String bill = "1234567890";

            System.out.println("Текущий баланс : " + balance);
            processPayment(bill);
            System.out.println("Текущий баланс : " + balance);
        }

        public static void processPayment(String bill) {
            TaskOnWrapperInteger.balance = TaskOnWrapperInteger.balance - Integer.parseInt(bill);
        }

}
