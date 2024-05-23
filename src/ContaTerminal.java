import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numeroConta;
        String agencia;
        String nomeCliente;
        float saldo;

        System.out.println("Bom dia!");
        System.out.println("Por favor, o numero da sua conta: ");
        numeroConta = scan.nextInt();
        scan.nextLine();
        System.out.println("Por favor, digite o numero da Agencia: ");
        agencia = scan.next();
        scan.nextLine();
        System.out.println("Por favor, informe seu nome: ");
        nomeCliente = scan.nextLine();
        System.out.println("Por favor, informe o saldo: ");
        saldo = scan.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponivel para saque.");
    }
}
