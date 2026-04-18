package model;

public class VetorDinamico {
  private Processo[] vetor;
  private int ocupacao;
  private int tamanhoInicial;

  public VetorDinamico() {
    this.tamanhoInicial = 4;
    this.vetor = new Processo[tamanhoInicial];
  }

  public VetorDinamico(int tamanho){
    this.tamanhoInicial = tamanho;
    this.vetor = new Processo[tamanho];
  }

  public void redimenciona(int novoTamanho){
    Processo[] temp = new Processo[novoTamanho];
    for (int i = 0; i < ocupacao; i++) {
      temp[i] = vetor[i];
    }
    vetor = temp;
  }

  public void listar(){
    for (int i = 0; i < vetor.length; i++) {
      System.out.println(vetor[i]);
    }
  }

  public void adiciona(Processo processo){
    if(estaCheio()){
      redimenciona(vetor.length*2);
    }
    vetor[ocupacao++] = processo;
  }

  public Processo remove() {
    if (estaVazio())
      return null;
    ocupacao --;
    Processo removed = vetor[ocupacao];
    double ocupacaoMinima = (double)vetor.length * 0.25;
    if (ocupacaoMinima > ocupacao && vetor.length != tamanhoInicial) {
      redimenciona(vetor.length / 2);
    }
    return removed;
  }

  public Processo get(int index) {
    if (index < 0 || index >= ocupacao) return null;
    return vetor[index];
  }

  public int buscarPorProtocolo(int protocolo){
    for (int i = 0; i < vetor.length; i++) {
      if(protocolo == vetor[i].getProtocolo()) return i;
    }
    return -1;
  }

  private boolean estaVazio(){
    return ocupacao == 0;
  }

  private boolean estaCheio(){
    return ocupacao == vetor.length;
  }

  public int getOcupacao() {
    return ocupacao;
  }

  public int size() {
    return vetor.length;
  }
}
