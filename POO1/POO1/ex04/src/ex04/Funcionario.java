
package ex04;


public class Funcionario {
    private String nome;
    private double salario;

    // Construtor para inicializar o nome e o salário
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // Métodos públicos para definir e obter o nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

   public double getSalario() {
        return this.salario;
    }
    }


