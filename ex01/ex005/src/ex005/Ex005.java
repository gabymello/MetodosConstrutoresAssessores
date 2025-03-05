
package ex005;

public class Ex005 {

   
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("19365-7", "Gabriely Mello");

        // Exibindo as informações da conta
        conta1.exibirInformacoes();

        // Realizando um depósito
        conta1.depositar(5000.0);

        // Realizando um saque
        conta1.sacar(2000.0);

        // Tentando realizar um saque maior que o saldo
        conta1.sacar(450.0);

        // Exibindo as informações finais da conta
        conta1.exibirInformacoes();
    }
}
    
    

