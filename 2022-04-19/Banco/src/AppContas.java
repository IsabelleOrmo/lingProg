import java.util.ArrayList;

public class AppContas {
    public static void main(String[] args) throws Exception {
        ContaBancaria contabanc1 = new ContaBancaria("Wiliam", 800);
        ContaPoupanca contapoup1 = new ContaPoupanca("Jeremias", 1000);
        ContaEspecial contaesp1 = new ContaEspecial("Michel", 1500, 500);

        ArrayList<ContaBancaria> contas = new ArrayList<ContaBancaria>();
        
        contas.add(contabanc1);
        contas.add(contapoup1);
        contas.add(contaesp1); 

        for(int index = 0; index < contas.size(); index++) {
            ContaBancaria contaTeste = (ContaBancaria) contas.get(index);
            contaTeste.testaConta();
        }
    }
}