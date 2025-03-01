
package contabancariaa;


public class Conta {
   public String titular;
    private double saldo;
    
        public Conta(String titular, double saldoInicial) {
        this.titular = titular;
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
            System.out.println("Saldo inicial não pode ser negativo. A conta foi criada com saldo 0.");
        }
        }
       public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Erro: O valor do depósito deve ser positivo.");
        }
    }
       
           public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else if (valor > saldo) {
            System.out.println("Erro: Saldo insuficiente para o saque.");
        } else {
            System.out.println("Erro: O valor do saque deve ser positivo.");
        }
           }
     public double getSaldo() {
        return this.saldo;
    }
}   

