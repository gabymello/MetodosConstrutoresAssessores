
package ex003;


public class Produto {
  private String nome;
    private double preco;
    private int quantidade;

    // Construtor que inicializa nome e preco, e define quantidade como 0
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = 0; // quantidade inicializada como 0
    }

    // Métodos acessores para os atributos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // Métodos para aumentar e diminuir a quantidade
    public void aumentarQuantidade(int quantidade) {
        if (quantidade > 0) {
            this.quantidade += quantidade;
        } else {
            System.out.println("Quantidade a ser adicionada deve ser maior que zero.");
        }
    }

    public void diminuirQuantidade(int quantidade) {
        if (quantidade > 0 && this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
        } else if (quantidade > 0) {
            System.out.println("Quantidade insuficiente para diminuir.");
        } else {
            System.out.println("Quantidade a ser removida deve ser maior que zero.");
        }
    }

    // Método para exibir as informações do produto
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade: " + quantidade);
    }   
}
