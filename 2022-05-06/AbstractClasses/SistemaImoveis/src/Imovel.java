import java.util.ArrayList;

public abstract class Imovel {
    private String endereco;
    private float valor;
    private static int qntImoveis = 0;
    private int codImovel;


    // Construtores
    public Imovel() {
        endereco = "";
        valor = 0;
        codImovel = ++qntImoveis;
    }

    public Imovel(String endereco, float valor) {
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

    public static void showNovo(ArrayList<Imovel> listaImoveis) {
        for (Imovel imovel : listaImoveis) {
            if (imovel instanceof Novo) {
                Novo imovelNovo = (Novo) imovel;
                imovelNovo.imprimirValores();
            }
        }
    }

    public static void showVelho(ArrayList<Imovel> listaImoveis) {
        for (Imovel imovel : listaImoveis) {
            if (imovel instanceof Antigo) {
                Antigo usadoImovel = (Antigo) imovel;
                usadoImovel.imprimirValores();
            }
        }
    }

    public static void showAll(ArrayList<Imovel> listaImoveis) {
        for (Imovel imovel : listaImoveis) {
            if (imovel instanceof Novo) {
                Novo imovelNovo = (Novo) imovel;
                imovelNovo.imprimirValores();
            } 

            if (imovel instanceof Antigo) {
                Antigo usadoImovel = (Antigo) imovel;
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
