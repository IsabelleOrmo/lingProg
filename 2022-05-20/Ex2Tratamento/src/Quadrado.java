import interfaces.AreaCalculavel;

public class Quadrado extends FormaGeometrica implements AreaCalculavel {
    // Atributos da classe
    private double lado;


    // Construtores da classe
    public Quadrado(double lado) {
        setLado(lado);
        setArea(calcularArea());
    }

    
    // Métodos da interface    
    @Override
    public double calcularArea() {
        return getLado() * getLado();
    }
    
    // Getters e setters
    public double getLado() {
        return this.lado;
    }

    public void setLado(double lado) {
        if (lado <= 0) {
            throw new IllegalArgumentException("Valor inválido, o valor esperado é maior que 0 (zero)");
        } else {
            this.lado = lado;
        }
    }
}
