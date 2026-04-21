/*
 * Integrantes do grupo:
 * - Isabella Silva e Santos RA: 1430482513004
 * - Gabriel Vicente Bernardinelli RA: 1430482513038
 * - Jorge Luiz Barbosa da Silva RA: 1430482411013
 * - Juan dos Santos Alonso RA: 1430482513009
 * - Nicole Lira Nova Cardoso RA: 1430482513043
 */

public class PilhaPrioridade {
    private PilhaProcesso pilhaUrgente = new PilhaProcesso();
    private PilhaProcesso pilhaNormal = new PilhaProcesso();
    private PilhaProcesso pilhaBaixa = new PilhaProcesso();

    public void push(Processo p) {
        switch (p.getPrioridade()) {
            case 1:
                pilhaBaixa.push(p);
                break;
            case 2:
                pilhaNormal.push(p);
                break;
            case 3:
                pilhaUrgente.push(p);
                break;
        }
    }

    public Processo pop() {
        if (pilhaUrgente.estaVazio()) {
            if (pilhaNormal.estaVazio()) {
                return pilhaBaixa.pop();
            }
            return pilhaNormal.pop();
        }
        return pilhaUrgente.pop();
    }

    public Processo peek() {
        if (pilhaUrgente.estaVazio()) {
            if (pilhaNormal.estaVazio()) {
                return pilhaBaixa.peek();
            }
            return pilhaNormal.peek();
        }
        return pilhaUrgente.peek();
    }

    public int capacidade() {
        return pilhaBaixa.capacidade() + pilhaNormal.capacidade() + pilhaUrgente.capacidade();
    }

    public void listar() {
        System.out.println("URGENTES: ");
        pilhaUrgente.imprimir();
        System.out.println("NORMAL: ");
        pilhaNormal.imprimir();
        System.out.println("BAIXA: ");
        pilhaBaixa.imprimir();
    }

    public boolean estaVazio() {
        return pilhaBaixa.estaVazio() && pilhaNormal.estaVazio() && pilhaUrgente.estaVazio();
    }
}
