public class ContaBancaria{
    private String cliente; 
    private int numConta;
    private double saldo;
    private static int qntContas = 1;
    
    // Construtor sem argumentos
    public ContaBancaria() {
        cliente = "";
        numConta = qntContas;
        saldo = 0;
        qntContas++;
    }
    // Construtor com argumentos
    public ContaBancaria(String cliente, double saldo) {
        this.cliente = cliente; 
        this.saldo = saldo;
        numConta = qntContas;
        qntContas++;
    }

    // Função de testes
    public void testaConta() {
        ContaBancaria contaTeste = this;

        double saldoAntigo = contaTeste.getSaldo();
        System.out.printf("\n\n\n\n\n---- TESTE DE MESA -----\n");
        System.out.println("Nome do cliente:  " + contaTeste.getCliente());
        System.out.println("Número da conta:  " + contaTeste.getNumConta());
        System.out.println("Saldo do cliente:  " + contaTeste.getSaldo());
        System.out.println("Realizado depósito de 500"); contaTeste.depositar(500);
        System.out.println("Saldo atual:  " + contaTeste.getSaldo());
        System.out.println("Realizado saque de 1000");
        System.out.println("Quantidade sacada:  " + contaTeste.sacar(1000));
        System.out.println("Saldo atual:  " + contaTeste.getSaldo());
        System.out.println("Saldo alterado para -500"); contaTeste.setSaldo(-500);
        System.out.println("Saldo atual:  " + contaTeste.getSaldo());
        System.out.println("Saldo alterado para 50"); contaTeste.setSaldo(50);
        System.out.println("Saldo atual:  " + contaTeste.getSaldo());
        contaTeste.setSaldo(saldoAntigo);
        System.out.println("Saldo retornado para o valor anterior.");
        System.out.println("Saldo atual:  " + contaTeste.getSaldo());
    }
    
    public double sacar(double valor) {
        valor = verifySaldo(valor);

        if (valor == 0 || valor > saldo) {
            System.out.println("Não é possível sacar.");
            return 0;
        }

        saldo -= valor;
        return valor;
    }

    public void depositar(double valor) {
        saldo += verifySaldo(valor);
    }

    protected double verifySaldo(double valor) {
        if (valor < 0) {
            return 0;
        }
        return valor;
    }


    // Um monte de set e get
    public int getNumConta() { // Não é possível definir o número da conta manualmente
        return this.numConta;
    }

    public String getCliente() {
        return this.cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return this.saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = verifySaldo(saldo);
    }
    protected void setSaldoUnverified(double saldo) {
        // Algo me diz que isso seria um baita de um problema num programa sério
        // To quase desistindo e usando protected mesmo 
        this.saldo = saldo;
    }
}