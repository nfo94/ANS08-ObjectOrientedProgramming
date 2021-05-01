package heritage;

public class BusinessAccount extends Account{
  private Double loanLimit;

  public BusinessAccount(){
//    super is to execute the constructor of the base class
    super();
  };

  public BusinessAccount(final Integer number, final String holder, final Double balance) {
    super(number, holder, balance);
    this.loanLimit = loanLimit;
  }

  public Double getLoanLimit() {
    return loanLimit;
  }

  public void setLoanLimit(final Double loanLimit) {
    this.loanLimit = loanLimit;
  }

  public void loan(double amount){
    if(amount <= loanLimit){
      balance += amount - 10.0;
    }
  }
}
