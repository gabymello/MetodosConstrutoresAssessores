
package ex004;

public class Veiculo {
  
    protected int velocidadeMaxima;

    // Construtor para inicializar a velocidade máxima
    public Veiculo(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}

// Classe Carro que herda de Veiculo
class Carro extends Veiculo {

    // Construtor que chama o construtor da classe base Veiculo
    public Carro(int velocidadeMaxima) {
        super(velocidadeMaxima);
    }

    // Método para exibir a velocidade máxima
    public void exibirVelocidadeMaxima() {
        System.out.println("A velocidade máxima do carro é: " + velocidadeMaxima + " km/h");
    }  
    
    
}
