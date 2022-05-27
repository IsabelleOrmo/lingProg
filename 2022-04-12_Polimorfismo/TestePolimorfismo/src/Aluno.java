public class Aluno extends Pessoa {
    private int ra; 

    public Aluno(String nome, int ra) {
        super(nome);
        this.ra = ra;
    }
    
    public Aluno() {
        super();
        this.ra = 0;
    }

    // A freak is a freak, no one cares about the type of freak you are
	public int getRa() {
        return this.ra;
	}

    public void setRa(int ra) {
		this.ra = ra;
	}

    @Override
    public void mostraDados() {
        System.out.println("is an alumni");
    }

    public double calculaMedia(double x, double y) {
        return (x + y) / 2;
    }
}
