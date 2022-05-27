public class Telefonistas extends Funcionario {
    private int codigo;

    public Telefonistas() {
        super();
        codigo = 0;
    }

    public Telefonistas(String nome, float salario, int codigo) {
        super(nome, salario);
        this.codigo = codigo; 
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void mostraDados(){
        super.mostraDados();
        System.out.println("Código do telefonista:  " + codigo);
    }
}
