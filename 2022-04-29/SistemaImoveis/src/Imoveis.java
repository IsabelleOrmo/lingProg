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


    // Métodos
    public void imprimirValores() {
        System.out.println("Código do imóvel:  " + getCodImovel());
        System.out.printf("Valor do imóvel:  R$ %.2f\n", getValor());
        System.out.println("Endereço:  " + getEndereco());
    }

    public static void showNovo(ArrayList<Imoveis> listaImoveis) {
        for (Imoveis imovel : listaImoveis) {
            if (imovel instanceof Novo) {
                Novo imovelNovo = (Novo) imovel;
                imovelNovo.imprimirValores();
            }
        }
    }

    public static void showVelho(ArrayList<Imoveis> listaImoveis) {
        for (Imoveis imovel : listaImoveis) {
            if (imovel instanceof Usado) {
                Usado usadoImovel = (Usado) imovel;
                usadoImovel.imprimirValores();
            }
        }
    }

    public static void showAll(ArrayList<Imoveis> listaImoveis) {
        for (Imoveis imovel : listaImoveis) {
            if (imovel instanceof Novo) {
                Novo imovelNovo = (Novo) imovel;
                imovelNovo.imprimirValores();
            } 

            if (imovel instanceof Usado) {
                Usado usadoImovel = (Usado) imovel;
                usadoImovel.imprimirValores();
            }   
        }
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

    public int getCodImovel() {
        return codImovel;
    }

    public static int getQntImoveis() {
        return qntImoveis;
    }
}
