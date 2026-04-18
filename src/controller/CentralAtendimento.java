package controller;

import model.PilhaProcesso;
import model.Processo;

public class CentralAtendimento {
    private PilhaProcesso pilha = new PilhaProcesso();
    private PilhaProcesso pilhaAux = new PilhaProcesso();
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
        while (!pilhaAux.isEmpty()) {
            pilhaAux.pop();
        }

    }
    public void atenderProximo(){
        pilhaAux.push(pilha.pop());
    }
    public void desfazerUltimoAtendimento(){
        pilha.push(pilhaAux.pop());
    }
    public void listarPendentes(){
        pilha.imprimir();
    }
    public void listarHistorico(){
        pilhaAux.imprimir();
    }
}
