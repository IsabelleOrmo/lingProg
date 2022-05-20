import interfaces.Forma2D;

public class Quadrado extends FormaGeometrica implements Forma2D {
    // Atributos da classe
    private double lado;


    // Construtores da classe
    public Quadrado(double lado) {
        setLado(lado);

        setPerimetro(calcularPerimetro());
        setArea(calcularArea());
    }

    
    // Métodos da interface    
    @Override
    public double calcularArea() {
        return getLado() * getLado();
    }

    @Override
    public double calcularPerimetro() {
        return getLado() * 4;
    }

    
    // Getters e setters
    public double getLado() {
        return this.lado;
    }

    public void setLado(double lado) {
        if (lado >= 0) {
            throw new IllegalArgumentException("“Valor inválido, o valor esperado é maior que 0 (zero)");
        } else {
            this.lado = lado;
        }
    }
}
