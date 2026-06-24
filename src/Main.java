void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("=== CRIAÇÃO DA CONTA ===");
    System.out.print("Digite o valor do depósito inicial: R$ ");
    double depositoInicial = scanner.nextDouble();

    ContaBancaria conta = new ContaBancaria(depositoInicial);

    int opcao;

    do {
        System.out.println("\n=== MENU ===");
        System.out.println("1 - Consultar saldo");
        System.out.println("2 - Consultar cheque especial");
        System.out.println("3 - Depositar dinheiro");
        System.out.println("4 - Sacar dinheiro");
        System.out.println("5 - Pagar boleto");
        System.out.println("6 - Verificar se está usando cheque especial");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Saldo atual: R$ " + conta.consultarSaldo());
                break;

            case 2:
                System.out.println("Cheque especial: R$ " + conta.consultarChequeEspecial());
                break;

            case 3:
                System.out.print("Digite o valor do depósito: R$ ");
                double valorDeposito = scanner.nextDouble();
                conta.depositar(valorDeposito);
                break;

            case 4:
                System.out.print("Digite o valor do saque: R$ ");
                double valorSaque = scanner.nextDouble();
                conta.sacar(valorSaque);
                break;

            case 5:
                System.out.print("Digite o valor do boleto: R$ ");
                double valorBoleto = scanner.nextDouble();
                conta.pagarBoleto(valorBoleto);
                break;

            case 6:
                if (conta.estaUsandoChequeEspecial()) {
                    System.out.println("A conta está usando cheque especial.");
                } else {
                    System.out.println("A conta não está usando cheque especial.");
                }
                break;

            case 0:
                System.out.println("Programa encerrado.");
                break;

            default:
                System.out.println("Opção inválida.");
        }

    } while (opcao != 0);

    scanner.close();
}