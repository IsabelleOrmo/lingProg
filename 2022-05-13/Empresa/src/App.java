import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Empregado> listaEmpregados = new ArrayList<Empregado>();

        listaEmpregados.add(new Assalariado("José", "Figueiredo", "248.310.020-11", 1000.6f));
        listaEmpregados.add(new Assalariado("Marcela", "Souza", "361.243.990-16", 5500.7f));
        listaEmpregados.add(new Comissionado("Antonieta", "Aparecida", "075.146.140-79", 7000, 10));
        listaEmpregados.add(new Comissionado("Mariana", "Macedo", "082.494.690-11", 6000, 15));
        listaEmpregados.add(new Horista("Renato", "Matheus", "340.246.800-05", 17, 40));
        listaEmpregados.add(new Horista("Felipe", "Gregório", "555.5555.555-05", 15, 50));

        System.out.printf("Vencimento total dos %d funcionários:  R$ %.2f\n\n", listaEmpregados.size(), Empregado.totalVencimento(listaEmpregados));
    }
}
