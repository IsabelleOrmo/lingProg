import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Escreva algo:  ");
        String uno;
        uno = input.nextLine();

        String dos = uno.concat(" em");
        System.out.println(dos);
        System.out.println(dos.endsWith("em"));

        String tres = dos.toLowerCase();
        System.out.println(tres);
        System.out.println(dos.equalsIgnoreCase(tres)); 

        input.close();
    }
}
