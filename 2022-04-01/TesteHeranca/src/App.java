public class App {         
    public enum estadoCivil  {
        SOLTEIRO,
        CASADO,
        DIVORCIADO,
        VIUVO
    } 

    public static void main(String[] args) throws Exception {
        Professor prof1 = new Professor();
        Bolsista bols1 = new Bolsista("Alex", 18, true, 15496680, estadoCivil.DIVORCIADO, 232323, true, 1700);
        
        prof1.mostra();
        bols1.mostra();

        System.out.println(bols1.getNome());
    }
}
