import java.util.ArrayList;

public abstract class Imoveis {
    private String endereco;
    private float valor;
    private static int qntImoveis = 0;
    private int codImovel;


    // Construtores
    public Imoveis() {
        endereco = "";
        valor = 0;
        codImovel = ++qntImoveis;
    }

    public Imoveis(String endereco, float valor) {
        this.endereco = endereco; 
        this.valor = valor;
        codImovel = ++qntImoveis;
    }


    // Imoveis
    public void imprimirValores() {
        System.out.printf("Valor do imóvel:  R$ %.2f", valor);
        System.out.println("Endereço:  " + endereco);
        System.out.println("Código do imóvel:  " + codImovel);
    }

    public static void calculaValor(ArrayList<Imoveis> listaImoveis) {

    }


    // Getters e setters
    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public float getValor() {
        return this.valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public static int getQntImoveis() {
        return qntImoveis;
    }
}
