import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Imovel> listaImoveis = new ArrayList<Imovel>();
        
        Novo imovel1 = new Novo("Avenida da Tristeza", 700000, 100); 
        Novo imovel2 = new Novo("Travessa da Amargura", 40000, 9000);
        Antigo usado1 = new Antigo("Alameda da Angústia", 82000, 1000); 
        Antigo usado2 = new Antigo("Entrada do Desespero", 45000, 200); 


        // Exemplo de criação de objetos de uma classe abstrata e posterior instaciação a partir de classes filhas (Polimorfismo)
        Imovel imovelNovo = new Novo("Rua do Declínio", 5000, 70000);
        Imovel imovelAntigo = new Antigo("Rodovia das Decepções", 65000, 3000); 

        // Exemplo de definição de um construtor para Imovel. Isso não funciona. Esquece que isso existiu.
        /*
        Imovel imovelImovel = new Imovel() {
            this.endereco = "Avenida das Lágrimas",
            this.valor = 9000,
            this.codImovel = Imovel.getQntImoveis()
        };
        */

        listaImoveis.add(imovel1); 
        listaImoveis.add(imovel2);
        listaImoveis.add(usado1);
        listaImoveis.add(usado2);
        listaImoveis.add(new Novo("Rotatória das Decepções", 23000, 2000));

        System.out.print("Lista de Imóveis NOVOS disponíveis:\n\n");
        Imovel.showNovo(listaImoveis);
    }
}
