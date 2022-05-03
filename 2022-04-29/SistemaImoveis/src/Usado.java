public class Usado extends Imoveis {
    private float desconto;

    // Construtores
    public Usado() {
        super();
        desconto = 0;
    }

    public Usado(String endereco, float valor, float desconto) {
        super(endereco, valor);
        this.desconto = desconto;
    }


    // Métodos
    @Override
    public void imprimirValores() {
        System.out.println("Imóvel USADO");
        super.imprimirValores();
        System.out.printf("Valor base:  R$ 2.f\n", super.getValor());
        System.out.printf("Valor do desconto:  R$ 2.f\n\n\n\n", getDesconto());
    }


    // Getters e setters
    public float getDesconto() {
        return this.desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    @Override
    public float getValor() {
        return super.getValor() - getDesconto();
    }
}
