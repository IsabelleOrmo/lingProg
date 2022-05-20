public class App {
    public static void main(String[] args) throws Exception {
        Aluno al1 =  new Aluno();

        try {
            al1.setRa(-1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            al1.setNome("");
        } catch (EmptyStringException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("RA do aluno:  " + al1.getRa());
    }
}
