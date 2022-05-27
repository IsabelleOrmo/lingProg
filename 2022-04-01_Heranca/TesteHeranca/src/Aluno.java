public class Aluno extends Pessoa {
    private int ra;
    private boolean passouAno;

    public Aluno(String nome, int idade, Boolean feliz, long cpf, App.estadoCivil eCivil, int ra, boolean passouAno) {
        super(nome, idade, feliz, cpf, eCivil);
        this.ra = ra;
        this.passouAno = passouAno;
    }

    public Aluno() {
        super();
        this.ra = 0;
        this.passouAno = true;
    }

    @Override
    public void mostra() {
        super.mostra();
        System.out.println("RA do aluno:  " + ra);
        System.out.println("Reprovou:  " + !passouAno);
    }

    public int getRa() {
        return this.ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public boolean didPassouAno() {
        return this.passouAno;
    }

    public void setPassouAno(boolean passouAno) {
        this.passouAno = passouAno;
    }
}
