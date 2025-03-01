
package ex09;


public class Animal {
  protected void fazerSom() {
        System.out.println("O animal faz um som.");
    }
}


class Cachorro extends Animal {
   
    
    protected void fazerSom() {
        System.out.println("O cachorro faz: Au Au!");
    }
}


class Gato extends Animal {
   
    protected void fazerSom() {
        System.out.println("O gato faz: Miau!");
    }
}  
    
    
    
    
    




    
    
    

