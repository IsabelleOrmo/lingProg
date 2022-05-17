import java.util.Scanner;
import java.util.regex.Pattern;

public class App {
    public static void testRegexException() {
        Scanner input = new Scanner(System.in);
        Pattern pattern = Pattern.compile("/d");
    
        String numero;
        boolean validInput = false;

        while (true) {
            System.out.print("Digite um número:  ");
            numero = input.nextLine();
            System.out.println(numero + " " + pattern.matcher(numero).find());
        }

        /*
        while (!validInput) {
            try {
                System.out.print("Digite um número:  ");
                numero = input.nextLine();

                if (pattern.matcher(numero).find()) {
                    validInput = true;
                    System.out.println("Valor válido!");
                } else {
                    throw new IllegalArgumentException();
                }

            } catch (IllegalArgumentException e) {
                validInput = false;
                System.out.println("Valor inválido!");
            }
        }
        */
    
        // input.close();
    }
    public static void main(String[] args) throws Exception {
        testRegexException();

        // ExeTryCatch.testeToUpper();
    }
}
