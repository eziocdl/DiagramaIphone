package interfaces;

public interface Navegador {
    default void adicionarAba() {
        System.out.println("Página atualizada. ");
    }

    default void atualizarPagina() {
        System.out.println("Página atualizada. ");
    }

    default void exibirAba() {
        System.out.println("Exibindo página. ");
    }

    
}
