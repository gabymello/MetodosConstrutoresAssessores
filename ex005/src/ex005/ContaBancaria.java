
package ex005;


public class ContaBancaria {
     private String numeroConta;
    private String nomeTitular;
    private double saldo;

    // Construtor que inicializa numeroConta, nomeTitular e define saldo como zero
    public ContaBancaria(String numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = 0.0; // saldo inicial como zero
    }

    // Métodos acessores para os atributos
    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Método para depositar um valor na conta
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso! Novo saldo: R$ " + saldo);
        } else {
            System.out.println("Valor de depósito inválido. O valor deve ser maior que zero.");
        }
    }

    // Método para sacar um valor da conta
    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso! Novo saldo: R$ " + saldo);
        } else if (valor > 0) {
            System.out.println("Saldo insuficiente para realizar o saque.");
        } else {
            System.out.println("Valor de saque inválido. O valor deve ser maior que zero.");
        }
    }

    // Método para exibir as informações da conta
    public void exibirInformacoes() {
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Nome do Titular: " + nomeTitular);
        System.out.println("Saldo: R$ " + saldo);
    }

}
