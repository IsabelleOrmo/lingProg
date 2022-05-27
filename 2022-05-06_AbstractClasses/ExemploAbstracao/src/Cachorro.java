import java.util.Scanner;

public class Cachorro extends Animal {
    
    @Override
    public void falar() {
        System.out.println("AUAUAU! * late alto *");
    }

    public void felicidade() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome:  ");
        try {
            if (input.nextLine().equals("Ormo")) {
                throw new Exception("Proibido Ormo.");
            }
        } catch (Exception e) {
            System.out.println("Pare.");
        } finally {
            input.close();
        }
    }
}
