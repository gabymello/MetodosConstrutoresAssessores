
package ex06;


public class Usuario {
private String login;
    private String senha;

    // Construtor para inicializar o login e a senha
    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    // Método para autenticar o usuário
    public boolean autenticar(String login, String senha) {
        // Verifica se o login e senha fornecidos são iguais aos armazenados
        return this.login.equals(login) && this.senha.equals(senha);
    }
} 
    
    
    
    
    
    
    
    

