package interfaces;

public interface Telefone {
    default void ligar() {
        System.out.println("Fazendo ligação!");
    }

    default void atender() {
        System.out.println("Alô.");
    }

    default void correioVoz() {
        System.out.println("Você possui um recado na sua caixa de entrada. ");
    }
    
    
}
