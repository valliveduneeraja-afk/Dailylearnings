class Bank {
    String accountnum;
    double balance;
    double minimumbal;

    Bank(String a, double b, double m) {
        accountnum = a;
        balance = b;
        minimumbal = m;
    }
}
    class BankAccount {
      public static void main(String[] args)  {
          Bank b1 = new Bank("ACC10045",15000.0, 5000.0);
          Bank b2 = new Bank("ACC10146",20000.0, 10000.0);
          Bank b3 = new Bank("ACC10247", 50000.0, 1000.0);
          Bank b4 = new Bank("ACC10348", 100000.0, 20000.0);

          System.out.println("Account Number: " + b1.accountnum);
          System.out.println("Current Balance: " + b1.balance);
          System.out.println("Minimum Balance: " + b1.minimumbal);
          System.out.println("Available for withdrawal: " + (b1.balance - b1.minimumbal));

          System.out.println("Account Number: " + b2.accountnum);
          System.out.println("Current Balance: " + b2.balance);
          System.out.println("Minimum Balance: " + b2.minimumbal);
          System.out.println("Available for withdrawal: " + (b2.balance - b2.minimumbal));

          System.out.println("Account Number: " + b3.accountnum);
          System.out.println("Current Balance: " + b3.balance);
          System.out.println("Minimum Balance: " + b3.minimumbal);
          System.out.println("Available for withdrawal: " + (b3.balance - b3.minimumbal));

          System.out.println("Account Number: " + b4.accountnum);
          System.out.println("Current Balance: " + b4.balance);
          System.out.println("Minimum Balance: " + b4.minimumbal);
          System.out.println("Available for withdrawal: " + (b4.balance - b4.minimumbal));
      }
    }

