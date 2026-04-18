
public class VetorTest {
  public static void main(String[] args) {
    VetorDinamico vetor = new VetorDinamico();
    Processo processo1 = new Processo("Jorge", "Cirurgia", 3);
    Processo processo2 = new Processo("Isabella", "Cirurgia", 2);
    Processo processo3 = new Processo("Nicole", "Cirurgia", 1);
    Processo processo4 = new Processo("Juan", "Cirurgia", 3);
    Processo processo5 = new Processo("Andreia", "Cirurgia", 2);
    Processo processo6 = new Processo("Gabriel", "Cirurgia", 1);
    Processo processo7 = new Processo("Luis", "Cirurgia", 3);
    Processo processo8 = new Processo("Marcelo", "Cirurgia", 1);

    vetor.adiciona(processo1);
    vetor.adiciona(processo2);
    vetor.adiciona(processo3);
    vetor.adiciona(processo4);

    vetor.adiciona(processo5);
    System.out.println("Ocupando: "+ vetor.getOcupacao());
    System.out.println("Tamanho aumentado: " + vetor.size());

    vetor.adiciona(processo6);
    vetor.adiciona(processo7);
    vetor.adiciona(processo8);

    vetor.adiciona(new Processo("Novo", "Geral", 1));
    System.out.println("Ocupando: "+ vetor.getOcupacao());
    System.out.println("Tamanho aumentado: " + vetor.size());

    System.out.println("\nLISTA DE PROCESSOS");
    vetor.listar();

    System.out.println("\nREMOVENDO ATÉ DIMINUIR");

    for (int i = 0; i < 6; i++) {
      vetor.remove();
      System.out.println("Removi um. Capacidade: " + vetor.getOcupacao() + " Tamanho:" + vetor.size());
    }

    System.out.println("\nEstado final do vetor:");
    vetor.listar();
  }
}
