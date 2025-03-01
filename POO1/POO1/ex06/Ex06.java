
package ex06;


public class Ex06 {

   
    public static void main(String[] args) {
        // Criando um objeto Usuario com login "admin" e senha "1234"
        Usuario usuario = new Usuario("admin", "1234");
        
        // Testando a autenticação
        boolean autenticado = usuario.autenticar("admin", "1234");
        System.out.println("Autenticação bem-sucedida: " + autenticado); // Deve imprimir true
        
        // Testando com dados errados
        autenticado = usuario.autenticar("admin", "abcd");
        System.out.println("Autenticação bem-sucedida: " + autenticado); // Deve imprimir false
    }
}
        
        
        
    
    

