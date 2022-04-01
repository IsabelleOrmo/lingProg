public class App { 
    public static void main(String[] args) throws Exception {
        Professor prof1 = new Professor();
        Bolsista bols1 = new Bolsista("Alex", 18, true, 15496680, Pessoa.estadoCivil.DIVORCIADO, 232323, true, 1700);
        
        prof1.setECivil(Pessoa.estadoCivil.CASADO);

        System.out.println(bols1.getNome());
    }
}
