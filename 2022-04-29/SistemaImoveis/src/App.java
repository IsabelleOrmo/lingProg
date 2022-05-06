import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Imovel> listaImovel = new ArrayList<Imovel>();
        
        Novo imovel1 = new Novo("Avenida da Tristeza", 700000, 100); 
        Novo imovel2 = new Novo("Travessa da Amargura", 40000, 9000);
        Antigo usado1 = new Antigo("Alameda da Angústia", 82000, 1000); 
        Antigo usado2 = new Antigo("Entrada do Desespero", 45000, 200); 

        listaImovel.add(imovel1); 
        listaImovel.add(imovel2);
        listaImovel.add(usado1);
        listaImovel.add(usado2);
        listaImovel.add(new Novo("Rotatória das Decepções", 23000, 2000));

        System.out.print("Lista de Imóveis NOVOS disponíveis:\n\n");
        Imovel.showNovo(listaImovel);
    }
}
