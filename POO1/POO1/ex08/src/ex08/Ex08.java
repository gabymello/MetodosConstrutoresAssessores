
package ex08;

public class Ex08 {

   
    public static void main(String[] args) {
      Porta minhaPorta = new Porta();

        // Exibindo o estado inicial da porta
        minhaPorta.exibirEstado();

        // Abrindo a porta
        minhaPorta.abrir();

        // Tentando abrir novamente a porta (já está aberta)
        minhaPorta.abrir();

        // Fechando a porta
        minhaPorta.fechar();

        // Tentando fechar novamente a porta (já está fechada)
        minhaPorta.fechar();

        // Exibindo o estado final da porta
        minhaPorta.exibirEstado();
    }
} 
        
        
    
    

