public class Bolsista extends Aluno {
    private double bolsa;

    public Bolsista (String nome, int idade, Boolean feliz, long cpf, App.estadoCivil eCivil, int ra, boolean passouAno, double bolsa) {
        super(nome, idade, feliz, cpf, eCivil, ra, passouAno);
        this.bolsa = bolsa;
    }

    public Bolsista () {
        super();
        this.nome = "michael";
        this.bolsa = 0;
    }

    public void mostra() {
        super.mostra();
        System.out.println("Valor da bolsa:  " + bolsa);
    }

    public double getBolsa() {
        return this.bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }
}
