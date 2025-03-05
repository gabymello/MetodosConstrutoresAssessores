
package ex003;


public class Ex003 {

    public static void main(String[] args) {
    Produto produto1 = new Produto("Cropped", 29.90);

        
        produto1.exibirInformacoes();

       
        produto1.aumentarQuantidade(20);
        System.out.println("\nApós aumentar a quantidade:");
        produto1.exibirInformacoes();

        
        produto1.diminuirQuantidade(10);
        System.out.println("\nApós diminuir a quantidade:");
        produto1.exibirInformacoes();

        
        produto1.diminuirQuantidade(20);
    }
}