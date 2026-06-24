public class ContaBancaria {
    private double saldo;
    private final double chequeEspecial;
    private double valorUsadoChequeEspecial;

    public ContaBancaria(double depositoInicial) {
        this.saldo = depositoInicial;

        if (depositoInicial <= 500) {
            this.chequeEspecial = 50.0;
        } else {
            this.chequeEspecial = depositoInicial * 0.5;
        }

        this.valorUsadoChequeEspecial = 0.0;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public double consultarChequeEspecial() {
        return chequeEspecial;
    }

    public boolean estaUsandoChequeEspecial() {
        return valorUsadoChequeEspecial > 0;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para depósito.");
            return;
        }

        saldo += valor;

        if (valorUsadoChequeEspecial > 0) {
            double taxa = valorUsadoChequeEspecial * 0.2;
            double totalDivida = valorUsadoChequeEspecial + taxa;

            if (saldo >= totalDivida) {
                saldo -= totalDivida;
                valorUsadoChequeEspecial = 0;
                System.out.println("Depósito realizado e dívida do cheque especial quitada com taxa.");
            } else {
                System.out.println("Depósito realizado, mas a dívida do cheque especial ainda não foi quitada.");
            }
        } else {
            System.out.println("Depósito realizado com sucesso.");
        }
    }

    public void sacar(double valor) {
        double limiteDisponivel = saldo + chequeEspecial - valorUsadoChequeEspecial;

        if (valor <= 0) {
            System.out.println("Valor inválido para saque.");
        } else if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso.");
        } else if (valor <= limiteDisponivel) {
            double restante = valor - saldo;
            saldo = 0;
            valorUsadoChequeEspecial += restante;
            System.out.println("Saque realizado usando cheque especial.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void pagarBoleto(double valor) {
        double limiteDisponivel = saldo + chequeEspecial - valorUsadoChequeEspecial;

        if (valor <= 0) {
            System.out.println("Valor inválido para pagamento.");
        } else if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Boleto pago com sucesso.");
        } else if (valor <= limiteDisponivel) {
            double restante = valor - saldo;
            saldo = 0;
            valorUsadoChequeEspecial += restante;
            System.out.println("Boleto pago usando cheque especial.");
        } else {
            System.out.println("Saldo insuficiente para pagar o boleto.");
        }
    }
}