
package ex04;


public class Retangulo {
    private double largura;
    private double altura;

    // Construtor que inicializa largura e altura
    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    // Métodos acessores para os atributos
    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Método para calcular a área do retângulo
    public double calcularArea() {
        return largura * altura;
    }

    // Método para exibir as informações do retângulo
    public void exibirInformacoes() {
        System.out.println("Largura: " + largura);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + calcularArea());
    }

}
