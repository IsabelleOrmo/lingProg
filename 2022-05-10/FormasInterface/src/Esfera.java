public class Esfera implements Forma3D, FormaEsfera {
    // Atributos
    private double raio;

    
    // Um número exacerbado de implementações. Minha cabeça dói.
    @Override
    public double calculaVolume() {
        return (4 * Math.PI * (Math.pow(raio, 3)) / 3);
    }

    @Override
    public double calculaArea() {
        return 4 * Math.PI * (raio * raio);
    }

    @Override
    public double calculaFuso(double angulo) {
        return (calculaArea() * angulo) / 360;
    }

    @Override
    public double calculaCunha(double angulo) {
        return (calculaVolume() * angulo) / 360;
    }

    @Override
    public double calculaRaioSetor(double distancia) {
        return (raio * raio) - (distancia * distancia);
    }

    @Override
    public double calculaAreaSetor(double distancia) {
        return Math.PI * (Math.pow(calculaRaioSetor(distancia), 2));
    }

    @Override
    public double calculaPerimetroSetor(double distancia) {
        return 2 * Math.PI * calculaRaioSetor(distancia);
    }

    
    // Getters e setters
    public double getRaio() {
        return this.raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
