
package ex10;


public class Carro {
  private String marca;
    private String modelo;
    
    // Atributo público
    public int ano;

    // Construtor para inicializar o Carro
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        // Utilizando o setter para validar o ano
        setAno(ano);
    }

    // Getter para o atributo marca
    public String getMarca() {
        return marca;
    }

    // Setter para o atributo marca
    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Getter para o atributo modelo
    public String getModelo() {
        return modelo;
    }

    // Setter para o atributo modelo
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Getter para o atributo ano
    public int getAno() {
        return ano;
    }

    // Setter para o atributo ano com validação
    public void setAno(int ano) {
        if (ano >= 1886) {
            this.ano = ano;  // Atribui o valor do ano se for válido
        } else {
            System.out.println("O ano do carro não pode ser menor que 1886.");
        }
    }
}

    
    
    

