import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do titular da conta: ");
        String nomeTitular = scanner.nextLine();
        System.out.print("Digite o saldo inicial da conta: ");
        double saldoInicial = scanner.nextDouble();

        Agencia conta = new Agencia(nomeTitular, saldoInicial);

        int opcao;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Consultar Saldo");
            System.out.println("4. Visualizar Saldo Total do Banco");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor do depósito: ");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 2:
                    System.out.print("Digite o valor do saque: ");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 3:
                    System.out.println("Saldo atual: R$" + conta.getSaldo());
                    break;
                case 4:
                    Agencia.saldoTotal();
                    break;
                case 0:
                    System.out.println("Saindo do sistema.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}