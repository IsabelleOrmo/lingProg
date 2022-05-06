import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        /*
        O equals serve pra comparar duas Strings.
        Nesse caso, pra ver um nome. 

        ---NÃO PODE--- usar == pra comparar Strings!!!!!!!

        isso pq o == vai comparar o endereço da string na memória, e não a string em si
        logo, vai sempre ter outro endereço e vai ser falso.
        ou seja, nn funciona. 

        pra comparar duas strings, SEMPRE EQUALS.
        */

        while(true) {
            System.out.print("Digite nome:  ");
            String nome = input.nextLine();
            
            if (nome == "Isabela Silvestre") {
                System.out.println("oi isa hetero\n\n");
            } else if (nome.equals("Isabelle Ormo")) {
                System.out.println("oi isa lesbica\n\n");
            } else {
                System.out.println("vai embora hetero\n\n");
            }
        }
    }
}
