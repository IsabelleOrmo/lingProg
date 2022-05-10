public class Circulo extends FormaGeometrica implements Forma2D {
    // Atributos da classe
    private double raio;

    
    // Construtores
    public Circulo(double raio) {
        this.raio = raio;

        setPerimetro(calcularPerimetro());
        setArea(calcularArea());
    }

    
    // Métodos da interface
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
    
    @Override
    public double calcularArea() {
        return Math.PI * (raio * raio);
    }

    
    // Getters e setters
    public double getRaio() {
        return this.raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
