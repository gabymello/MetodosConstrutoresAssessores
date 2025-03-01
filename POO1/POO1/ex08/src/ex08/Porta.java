
package ex08;


public class Porta {
    private boolean aberta;

    // Construtor que inicializa a porta como fechada (false)
    public Porta() {
        this.aberta = false;  // A porta está inicialmente fechada
    }

    // Método para abrir a porta
    public void abrir() {
        if (!aberta) {
            aberta = true;  // Altera o estado para aberta
            System.out.println("A porta foi aberta.");
        } else {
            System.out.println("A porta já está aberta.");
        }
    }

    // Método para fechar a porta
    public void fechar() {
        if (aberta) {
            aberta = false;  // Altera o estado para fechada
            System.out.println("A porta foi fechada.");
        } else {
            System.out.println("A porta já está fechada.");
        }
    }

    // Método para verificar o estado da porta
    public void exibirEstado() {
        if (aberta) {
            System.out.println("A porta está aberta.");
        } else {
            System.out.println("A porta está fechada.");
        }
    }
} 

