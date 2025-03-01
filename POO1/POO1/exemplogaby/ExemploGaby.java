
package exemplogaby;


public class ExemploGaby {

    
    public static void main(String[] args) {
       Produto produto = new Produto();
       produto.setNome("teclado");
       produto.setPreco(100);
       
       
        System.out.println("nome :" + produto.getNome());
        System.out.println("preco: " + produto.getPreco());
    }
    
}
