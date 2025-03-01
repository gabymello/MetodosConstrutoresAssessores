
package ex07;


public class Pessoa {
    protected int idade;

    // Construtor para inicializar a idade
    public Pessoa(int idade) {
        this.idade = idade;
    }
}

// Classe Aluno que herda de Pessoa
class Aluno extends Pessoa {

    // Construtor que chama o construtor da classe base Pessoa
    public Aluno(int idade) {
        super(idade);  // Inicializa o atributo idade da classe base
    }

    // Método para definir a idade
    public void definirIdade(int idade) {
        this.idade = idade;
    }

    // Método para exibir a idade
    public void exibirIdade() {
        System.out.println("A idade do aluno é: " + idade + " anos.");
    }
}
 

