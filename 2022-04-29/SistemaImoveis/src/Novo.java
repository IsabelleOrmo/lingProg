public class Novo extends Imoveis {
    private float valorAdicional;
    
    // Construtores
    public Novo() {
        super();
        valorAdicional = 0;
    }
    
    public Novo(String endereco, float valor, float valorAdicional) {
        super(endereco, valor);
        this.valorAdicional = valorAdicional;
    }


    // Métodos
    @Override
    public void imprimirValores() {
        System.out.println("Imóvel NOVO");
        super.imprimirValores();
        System.out.printf("Valor base:  R$ %.2f\n", super.getValor());
        System.out.printf("Valor adicional:  R$ %.2f\n\n\n\n", getValorAdicional());
    }

    
    // Getters e setters
    public float getValorAdicional() {
        return this.valorAdicional;
    }
    
    public void setValorAdicional(float valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    @Override
    public float getValor() {
        return super.getValor() + getValorAdicional();
    }
}