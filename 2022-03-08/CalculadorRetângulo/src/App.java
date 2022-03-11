import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira os valores do retângulo:  ");
        Retangulo ret1 = new Retangulo();
        
        ret1.setAltura(input.nextInt());
        ret1.setBase(input.nextInt());

        System.out.println("Perímetro:  " + ret1.perimetro());
        System.out.println("Área:  " + ret1.area());

        input.close();
    }
}
