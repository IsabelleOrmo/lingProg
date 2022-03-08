import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Caneta canetinha = new Caneta(1, "amarelo", "cis", -4f);

        System.out.println(canetinha.getNumero());
        System.out.println(canetinha.getPreco());

        Aluno a2 = new Aluno(201176, input.nextLine());

        System.out.println(a2.getRa());
        System.out.println(a2.getName());

        input.close();
    }
}
