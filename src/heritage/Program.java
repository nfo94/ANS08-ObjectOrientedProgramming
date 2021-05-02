package heritage;

public class Program {
  public static void main(String[] args) {
    Account acc = new Account(1001, "Natalia Oliveira", 0.0);
    BusinessAccount bacc = new BusinessAccount(1002, "Marcelo Oliveira", 500.0);

//    UPCASTING
    Account acc1 = bacc;
    Account acc2 = new BusinessAccount(1003, "Bob", 200.0);
    Account acc3 = new SavingsAccount(1000, "Anna", 0.0, 0.01);

//    DOWNCASTING
    BusinessAccount acc4 = (BusinessAccount)acc2;
//    ERROR!
//    BusinessAccount acc5 = (BusinessAccount)acc3;
  }
}
