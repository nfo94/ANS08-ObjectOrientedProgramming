package aps.unifacs;

public class Cliente {
  private final int numeroDaConta;
  private final String nomeDoCliente;
  private float saldo;
  private final byte tipo;

  public Cliente(int numeroDaConta, String nomeDoCliente, float saldo, byte tipo){
    this.numeroDaConta = numeroDaConta;
    this.nomeDoCliente = nomeDoCliente;
    this.saldo = saldo;
    this.tipo = tipo;
  }

  public int getNumeroDaConta() {
    return numeroDaConta;
  }

  public void getInformacoesDaConta() {
    System.out.println("Numero da conta: " + this.numeroDaConta);
    System.out.println("Nome do cliente: " + this.nomeDoCliente);
    System.out.println("Saldo da conta: " + this.saldo);
    System.out.println("Tipo da conta: " + this.tipo);
  }

  public void debitarSaldo(float valor) {
    if(valor > this.saldo)
      throw new RuntimeException("Saldo insuficiente");
    else
      this.saldo -= valor;
  }

  public void creditarSaldo(float valor){
    this.saldo += valor;
  }
}

