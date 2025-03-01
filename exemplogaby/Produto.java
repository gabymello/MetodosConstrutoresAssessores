
package exemplogaby;

public class Produto {
   private String nome;
    private double preco;
    
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;       
    }
       
    public double getPreco() {
        return this.preco;
    }
    
   
    
      public void setPreco(double preco) {
        // Verificando se o preço é negativo
        if (preco < 0) {
            System.out.println("Erro: O preco nao pode ser negativo!");
        } else {
            this.preco = preco;
        }
      }

   
    }

