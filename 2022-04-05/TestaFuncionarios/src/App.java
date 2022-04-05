public class App {

    public static void mostraBonificacao (Funcionario func) {
        System.out.println("A bonificacação do funcionário " + func.getNome() + " é:  " + func.calculaBonificacao());
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Funcionario func1 = new Funcionario("Lucilda", 250);
        Gerentes gen1 = new Gerentes("Alberto", 1200, "albertin000", "12345");
        Telefonistas tel1 = new Telefonistas("Gilberto", 500, 55785);
        Secretarias sec1 = new Secretarias("Paulo", 27800, 69);

        mostraBonificacao(func1);
        mostraBonificacao(gen1);
        mostraBonificacao(tel1);
        mostraBonificacao(sec1);

        func1.mostraDados();
        gen1.mostraDados();
        tel1.mostraDados();
        sec1.mostraDados();
    }
}
