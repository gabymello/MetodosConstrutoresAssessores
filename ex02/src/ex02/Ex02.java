
package ex02;


public class Ex02 {

   
    public static void main(String[] args) {
     Livro livro1 = new Livro("2016", "Lily Bloom", 2022, "Romance");

       
        livro1.exibirInformacoes();

       
        if (livro1.pertenceAoGenero("Romance")) {
            System.out.println("O livro pertence ao gênero Romance.");
        } else {
            System.out.println("O livro NÃO pertence ao gênero Romance.");
        }

        
        if (livro1.pertenceAoGenero("Terror")) {
            System.out.println("O livro pertence ao gênero Terror.");
        } else {
            System.out.println("O livro NÃO pertence ao gênero Terror.");
        }
    }
}  
    

