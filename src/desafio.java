import java.util.Scanner;

public class desafio {
    void main() {
        Scanner sc = new Scanner(System.in);
        String nome = "Deglan Silva";
        String tipoConta = "Corrente";
        double saldoInicial = 2500.0;

        IO.println("--------------------");
        IO.println("Dados Iniciais do cliente: ");
        IO.println();
        IO.println("Nome:          " + nome);
        IO.println("Tipo conta:    " + tipoConta);
        IO.println("Saldo inicial: " + saldoInicial);
        IO.println("--------------------");

        int valor = 0;

        while (valor != 4) {
            IO.println("Operações: ");
            IO.println();
            IO.println("1- Consultar saldos ");
            IO.println("2- Receber valor");
            IO.println("3- Transferir valor");
            IO.println("4- Sair");
            IO.println();
            IO.println("Digite a opcao desejada: ");
            valor = sc.nextInt();

            if (valor == 1) {
                System.out.println("Saldo: " + saldoInicial);
            } else if (valor == 2) {
                System.out.println("Informe o valor a receber: ");
                double valorReceber = sc.nextDouble();
                saldoInicial += valorReceber;
                System.out.println("Saldo atualizado: R$ " + saldoInicial);
            } else if (valor == 3) {
                System.out.println("Informe o valor que deseja transferir: ");
                double pix = sc.nextDouble();
                if (pix < 0) {
                    System.out.println("Saldo menor que 0. Tente novamente");
                } else if (pix > saldoInicial) {
                    System.out.println("Saldo indisponivel. Tente novamente");
                } else {
                    saldoInicial -= pix;
                }
                System.out.println("Saldo atualizado R$ " + saldoInicial);
            } else if (valor == 4) {
                System.out.println("falou pai");
            }

        }
    }
}
