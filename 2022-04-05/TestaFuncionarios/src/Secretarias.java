public class Secretarias extends Funcionario {
    private int numRamal;

    public Secretarias(){
        super();
        numRamal = 0;
    }

    public Secretarias(String nome, float salario, int numRamal){
        super(nome, salario);
        this.numRamal = numRamal;
    }

    public int getNumRamal() {
        return this.numRamal;
    }

    public void setNumRamal(int numRamal) {
        this.numRamal = numRamal;
    }

    public void mostraDados(){
        super.mostraDados();
        System.out.println("Seu ramal é:  " + numRamal);
    }
}
