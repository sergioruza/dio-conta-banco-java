import java.util.Scanner;

public class ContaTerminal {
  int numero;
  String agencia;
  String nomeCliente;
  float saldo;
  public static void main(String[] args) {
    final Scanner sc1 = new Scanner(System.in);
    ContaTerminal conta = new ContaTerminal();

    System.out.print("Digite o número da conta: ");
    conta.numero = sc1.nextInt();

    System.out.print("Digite sua agência: ");
    conta.agencia = sc1.next();

    System.out.print("Digite o nome do cliente: ");
    conta.nomeCliente = sc1.next();

    System.out.print("Digite o saldo: ");
    conta.saldo = sc1.nextFloat();

    sc1.close();
  }
}
