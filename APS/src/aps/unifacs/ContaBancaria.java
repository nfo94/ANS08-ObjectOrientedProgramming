package aps.unifacs;

public class ContaBancaria {
  private final Cliente[] clientes;
  private int contador;

  public ContaBancaria(int quantidadeDeClientes){
    this.clientes = new Cliente[quantidadeDeClientes];
    this.contador = 0;
  }

  public void adicionaClientes(Cliente cliente){
    this.clientes[this.contador] = cliente;
    this.contador += 1;
  }

  private Cliente procurarCliente(int numeroDaConta){
    int i = 0;
    boolean achou = false;
    Cliente resposta;

    while((!achou) && (i < this.contador)){
      if(this.clientes[i].getNumeroDaConta() == (numeroDaConta))
        achou = true;
      else
        i += 1;
    }

    if(achou)
      resposta = this.clientes[i];
    else
      throw new RuntimeException("Cliente inexistente");
    return resposta;
  }

  public void deposito(int numeroDaConta, float valorDoDeposito){
    Cliente c;
    c = this.procurarCliente(numeroDaConta);
    c.creditarSaldo(valorDoDeposito);
  }

  public void saque(int numeroDaConta, float valorDoSaque){
    Cliente c;
    c = this.procurarCliente(numeroDaConta);
    c.debitarSaldo(valorDoSaque);
  }

  public void extratoBancario(int numeroDaConta){
    Cliente c;
    c = this.procurarCliente(numeroDaConta);
    c.getInformacoesDaConta();
  }
}
