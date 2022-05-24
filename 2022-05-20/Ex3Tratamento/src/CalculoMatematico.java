public class CalculoMatematico {
    public int divisao(int num1, int num2) {
        try {
            return num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println("A divisão não pode ser realizada.");
            return 0;
        }
    }
}
