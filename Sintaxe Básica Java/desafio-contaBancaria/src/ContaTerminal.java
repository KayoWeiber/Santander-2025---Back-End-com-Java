import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        var scanner= new Scanner(System.in);
        System.out.print("\nDigite o Numero da Conta: "); var numeroConta = scanner.nextInt();
        System.out.print("\nDigite o numero da agencia: "); var agencia = scanner.nextInt();
        System.out.print("\nDigite o nome do usuario: "); var nomeCliente = scanner.next();
        System.out.print("\nDigite o saldo da conta: "); var saldo = scanner.nextDouble();

        System.out.printf("\n Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque",nomeCliente,agencia,numeroConta,saldo);
    }
}