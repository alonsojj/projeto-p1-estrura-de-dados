package model;

public class PilhaPrioridade {
    private PilhaProcesso pilhaUrgente = new PilhaProcesso();
    private PilhaProcesso pilhaNormal = new PilhaProcesso();
    private PilhaProcesso pilhaBaixa = new PilhaProcesso();

    public void push(Processo p){
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
    public Processo pop(){
        if(pilhaUrgente.isEmpty()){
            if (pilhaNormal.isEmpty()) {
                return pilhaBaixa.pop();
            }
            return pilhaNormal.pop();
        }
        return pilhaUrgente.pop();
    }
        
    public Processo peek(Processo p){
        if(pilhaUrgente.isEmpty()){
            if (pilhaNormal.isEmpty()) {
                return pilhaBaixa.peek();
            }
            return pilhaNormal.peek();
        }
        return pilhaUrgente.peek();
    }
    public int tamanho(){
        return pilhaBaixa.tamanho() + pilhaNormal.tamanho() + pilhaUrgente.tamanho();
    }
    public void imprimir(){
        System.out.println("URGENTES: ");
        pilhaUrgente.imprimir();
        System.out.println("NORMAL: ");
        pilhaNormal.imprimir();
        System.out.println("BAIXA: ");
        pilhaBaixa.imprimir();
    }
    public boolean estaVazio(){
        return pilhaBaixa.isEmpty() && pilhaNormal.isEmpty() && pilhaUrgente.isEmpty();
    }
}
