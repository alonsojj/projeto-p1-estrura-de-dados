/*
 * Integrantes do grupo:
 * - Isabella Silva e Santos RA: 1430482513004
 * - Gabriel Vicente Bernardinelli RA: 1430482513038
 * - Jorge Luiz Barbosa da Silva RA: 1430482411013
 * - Juan dos Santos Alonso RA: 1430482513009
 * - Nicole Lira Nova Cardoso RA: 1430482513043
 */


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
        pilha.listar();
    }
    public void listarHistorico(){
        pilhaAux.listar();
    }
}

