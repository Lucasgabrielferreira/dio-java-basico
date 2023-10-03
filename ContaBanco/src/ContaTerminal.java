import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira o número da agência
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        // Solicitar ao usuário que insira o número da conta
        System.out.print("Agora, digite o número da Conta: ");
        int numero = scanner.nextInt();

        // Limpar o buffer do teclado
        scanner.nextLine();

        // Solicitar ao usuário que insira o nome do cliente
        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        // Solicitar ao usuário que insira o saldo da conta
        System.out.print("Digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        // Fechar o scanner, pois não será mais utilizado
        scanner.close();

        // Exibir a mensagem de boas-vindas com os dados da conta
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
