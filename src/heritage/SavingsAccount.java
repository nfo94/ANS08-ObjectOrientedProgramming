package heritage;

public class SavingsAccount extends Account {
  private Double interestRate;

  public SavingsAccount(){
    super();
  }

  public SavingsAccount(final Integer number, final String holder, final Double balance, final Double interestRate) {
    super(number, holder, balance);
    this.interestRate = interestRate;
  }

  public Double getInterestRate() {
    return interestRate;
  }

  public void setInterestRate(final Double interestRate) {
    this.interestRate = interestRate;
  }

  public void updateBalance(){
    balance += balance * interestRate;
  }
}
