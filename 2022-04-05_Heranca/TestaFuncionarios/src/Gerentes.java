public class Gerentes extends Funcionario {
    private String userName;
    private String password;

    public Gerentes() {
        super();
        userName = "";
        password = "";
    }

    public Gerentes(String nome, float salario, String userName, String password) {
        super(nome, salario); 
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public float calculaBonificacao() {
        return salario * 0.2F;
    } 

    public void mostraDados(){
        super.mostraDados();
        System.out.println("ola, gerente, seu username é " + userName);
    }

}
