public class AppContas {
    public static void main(String[] args) throws Exception {
        ContaBancaria contabanc1 = new ContaBancaria("Wiliam", 800);
        ContaPoupanca contapoup1 = new ContaPoupanca("Jeremias", 1000);
        ContaEspecial contaesp1 = new ContaEspecial("Michel", 1500, 500);
        
        
        contabanc1.testaConta();
        contapoup1.testaConta();
        contaesp1.testaConta();
    }
}
