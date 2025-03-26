import java.util.Scanner;

public class ContaTerminal {
  int Numero = 0;
  String Agencia = "";
  String NomedoCliente = "";
  float Saldo = 0.0F;

  public static void main(String[] args) {
    ContaTerminal conta = new ContaTerminal();
    Scanner input = new Scanner(System.in);

    System.out.println("Digite o seu nome : ");
    conta.NomedoCliente = input.next();

    System.out.println("Por favor, digite o número da Agência !");
    conta.Agencia = input.next();

    System.out.println("Digite o numero da sua conta : ");
    conta.Numero = input.nextInt();

    System.out.println("Digite o valor para saque : ");
    conta.Saldo = input.nextFloat();

    System.out.println("Olá " + conta.NomedoCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.Agencia + ", conta " + conta.Numero + " e seu saldo " + conta.Saldo + " já está disponível para saque.");
  }
}