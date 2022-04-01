
public class Professor extends Pessoa {
    private float salario;
    private byte num;

    public Professor(String nome, int idade, Boolean feliz, long cpf, App.estadoCivil eCivil, byte num, float salario) {
        super(nome, idade, feliz, cpf, eCivil);
        this.num = num;
        this.salario = salario;
    }

    public Professor(){
        super();
        this.num = 0;
        this.salario = 0;
    }

    public void mostra() {
        super.mostra();
        System.out.println("Salário do professor:  " + salario);
    }

    public float getSalario() {
        return this.salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public byte getNum() {
        return this.num;
    }

    public void setNum(byte num) {
        this.num = num;
    }
}
