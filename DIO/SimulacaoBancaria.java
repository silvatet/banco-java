package DIO;

import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0.0;

        while (true) {
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    double valorDepositado = scanner.nextDouble();
                    saldo += valorDepositado;
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    double valorSaque = scanner.nextDouble();
                    if (saldo >= valorSaque) {
                        saldo -= valorSaque;
                        System.out.println("Saldo atual: " + saldo);
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}