
public class PilhaProcesso {
    private VetorDinamico vetor;

    public PilhaProcesso() {
        this.vetor = new VetorDinamico();
    }

    public void push(Processo processo) {
        vetor.adiciona(processo);
    }

    public Processo pop() {
        if (estaVazio()) {
            throw new PilhaVaziaException("A pilha está vazia");
        }
        return vetor.remove();
    }

    public Processo peek() {
        if (estaVazio()) {
            throw new PilhaVaziaException("A pilha está vazia");
        }
        return vetor.get(vetor.getOcupacao() - 1);
    }

    public void imprimir() {
        for (int i = vetor.getOcupacao() - 1; i >= 0; i--) {
            System.out.println(vetor.get(i));
        }
    }

    public boolean estaVazio() {
        return vetor.getOcupacao() == 0;
    }

    public int capacidade() {
        return vetor.getCapacidade();
    }
}
