public class TestePrioridade {

    public static void main(String[] args) {

        PilhaPrioridade pilha = new PilhaPrioridade();

        // Inserindo fora de ordem
        pilha.push(new Processo("João", "Documento", 1));
        pilha.push(new Processo("Maria", "Cadastro", 2));
        pilha.push(new Processo("Pedro", "Emergência", 3));
        pilha.push(new Processo("Ana", "Financeiro", 1));
        pilha.push(new Processo("Carlos", "Urgente", 3));

        System.out.println("Teste");
        System.out.println("Esperado: prioridades 3 primeiro, depois 2, depois 1");
        System.out.println();

        while (!pilha.estaVazio()) {
            Processo p = pilha.pop();
            System.out.println(p);
        }
    }
}