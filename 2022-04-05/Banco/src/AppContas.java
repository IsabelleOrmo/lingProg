public class AppContas {
    public static void main(String[] args) throws Exception {
        // ContaBancaria contabanc1 = new ContaBancaria("Wiliam", 800);
        // ContaPoupanca contapoup1 = new ContaPoupanca("Jeremias", 1000);
        ContaEspecial contaespe1 = new ContaEspecial("Michel", 1500, 500);

        System.out.println("Saldo atual:  " + contaespe1.getSaldo() + "\nSaque:  " + contaespe1.sacar(1000)); 
        System.out.println("Saldo atual:  " + contaespe1.getSaldo() + "\nSaque:  " + contaespe1.sacar(800)); 
        System.out.println("Saldo atual:  " + contaespe1.getSaldo() + "\nSaque:  " + contaespe1.sacar(50)); 
        System.out.println("Saldo atual:  " + contaespe1.getSaldo() + "\nSaque:  " + contaespe1.sacar(500)); 
    }
}
