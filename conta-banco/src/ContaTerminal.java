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
    sc1.nextLine();

    System.out.print("Digite o nome do cliente: ");
    conta.nomeCliente = sc1.nextLine();

    System.out.print("Digite o saldo: ");
    conta.saldo = sc1.nextFloat();

    sc1.close();

    conta.imprimirDados();
  }
  
  public void imprimirDados() {
    System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-");
    System.out.println("Número da conta: " + numero);
    System.out.println("Número da agẽncia: " + agencia);
    System.out.println("Nome do cliente: " + nomeCliente);
    System.out.println("Saldo em conta: " + saldo);
  }
}
