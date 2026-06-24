void main() {
    Scanner scanner = new Scanner(System.in);

    IO.println("=== CRIAÇÃO DA CONTA ===");
    IO.print("Digite o valor do depósito inicial: R$ ");
    double depositoInicial = scanner.nextDouble();

    ContaBancaria conta = new ContaBancaria(depositoInicial);

    int opcao;

    do {
        IO.println("\n=== MENU ===");
        IO.println("1 - Consultar saldo");
        IO.println("2 - Consultar cheque especial");
        IO.println("3 - Depositar dinheiro");
        IO.println("4 - Sacar dinheiro");
        IO.println("5 - Pagar boleto");
        IO.println("6 - Verificar se está usando cheque especial");
        IO.println("0 - Sair");
        IO.print("Escolha uma opção: ");
        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                IO.println("Saldo atual: R$ " + conta.consultarSaldo());
                break;

            case 2:
                IO.println("Cheque especial: R$ " + conta.consultarChequeEspecial());
                break;

            case 3:
                IO.print("Digite o valor do depósito: R$ ");
                double valorDeposito = scanner.nextDouble();
                conta.depositar(valorDeposito);
                break;

            case 4:
                IO.print("Digite o valor do saque: R$ ");
                double valorSaque = scanner.nextDouble();
                conta.sacar(valorSaque);
                break;

            case 5:
                IO.print("Digite o valor do boleto: R$ ");
                double valorBoleto = scanner.nextDouble();
                conta.pagarBoleto(valorBoleto);
                break;

            case 6:
                if (conta.estaUsandoChequeEspecial()) {
                    IO.println("A conta está usando cheque especial.");
                } else {
                    IO.println("A conta não está usando cheque especial.");
                }
                break;

            case 0:
                IO.println("Programa encerrado.");
                break;

            default:
                IO.println("Opção inválida.");
        }

    } while (opcao != 0);

    scanner.close();
}