package unifacs.n1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n, m;
    String aux;

    System.out.println("Informe o conjunto de numeros e 0 para sair: ");
    aux = in.readLine();
    m = Integer.valueOf(aux).intValue();

    do {
      System.out.println("Informe um conjunto de numeros e 0 para sair: ");
      aux = in.readLine();
      n = Integer.valueOf(aux).intValue();

      if (n != 0){
        if(n < m){
          m = n;
        }
      }
    } while (n != 0);

    System.out.println(m);
  }
}
