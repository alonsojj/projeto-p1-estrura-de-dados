

public class CentralAtendimento {
    private PilhaPrioridade pilha = new PilhaPrioridade();
    private PilhaPrioridade pilhaAux = new PilhaPrioridade();
    public void abrirProcesso(Processo p){
        pilha.push(p);
        /*
        pilhaAux = new PilhaProcesso();
        podemos deixar o garbage colector lidar com a remoção
         ou 
        pop no try catch até o erro aparecer
         ou 
        adiciona uma função auxiliar para indicar o vaizio(mas isso n ta explicito no pdf)
        */
        while (!pilhaAux.estaVazio()) {
            pilhaAux.pop();
        }

    }

    public Processo atenderProximo() {
        Processo processo = pilha.pop();
        pilhaAux.push(processo);
        return processo;
    }

    public Processo desfazerUltimoAtendimento() {
        Processo processo = pilhaAux.pop();
        pilha.push(processo);
        return processo;
    }

    public void listarPendentes() {
        pilha.imprimir();
    }
    public void listarHistorico(){
        pilhaAux.imprimir();
    }
}
