import java.util.Scanner;

class Agencia {
    private String nome;
    private double saldo;
    private static double saldoBanco = 0;

    public Agencia(String nome, double saldoInicial) {
        this.nome = nome;
        saldo = saldoInicial;
        saldoBanco += saldoInicial;
    }

    public void depositar(double valor) {
        saldo += valor;
        saldoBanco += valor;
        System.out.println("Depositado: " + valor);
        System.out.println("Novo saldo: " + saldo + "\n");
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            saldoBanco -= valor;
            System.out.println("Saque de " + valor + " Realizado");
            System.out.println("Novo saldo: " + saldo + "\n");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public static void saldoTotal() {
        System.out.println("O saldo do banco é " + saldoBanco);
    }

    public double getSaldo(){
        return saldo;
    }

}