
public class VetorDinamico {
  private Processo[] vetor;
  private int ocupacao;
  private int capacidadeInicial;
  private int capacidade;

  public VetorDinamico() {
    this.capacidadeInicial = 4;
    this.vetor = new Processo[capacidadeInicial];
  }

  public VetorDinamico(int tamanho) {
    this.capacidadeInicial = tamanho;
    this.vetor = new Processo[tamanho];
  }

  public void redimenciona(int novoTamanho) {
    Processo[] temp = new Processo[novoTamanho];
    for (int i = 0; i < ocupacao; i++) {
      temp[i] = vetor[i];
    }
    vetor = temp;
  }

  public void listar() {
    for (int i = 0; i < capacidade; i++) {
      System.out.println(vetor[i]);
    }
  }

  public void adiciona(Processo processo) {
    if (estaCheio()) {
      redimenciona(capacidade * 2);
    }
    vetor[ocupacao++] = processo;
  }

  public Processo remove() {
    if (estaVazio())
      return null;
    ocupacao--;
    Processo removed = vetor[ocupacao];
    double ocupacaoMinima = (double) capacidade * 0.25;
    if (ocupacaoMinima > ocupacao && capacidade != capacidadeInicial) {
      redimenciona(capacidade / 2);
    }
    return removed;
  }

  public Processo get(int index) {
    if (index < 0 || index >= ocupacao)
      return null;
    return vetor[index];
  }

  public int buscarPorProtocolo(int protocolo) {
    for (int i = 0; i < capacidade; i++) {
      if (protocolo == vetor[i].getProtocolo())
        return i;
    }
    return -1;
  }

  private boolean estaVazio() {
    return ocupacao == 0;
  }

  private boolean estaCheio() {
    return ocupacao == capacidade;
  }

  public int getOcupacao() {
    return ocupacao;
  }

  public int getCapacidade() {
    return capacidade;
  }
}
