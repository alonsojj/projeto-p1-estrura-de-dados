
/*
 * Integrantes do grupo:
 * - Isabella Silva e Santos RA: 1430482513004
 * - Gabriel Vicente Bernardinelli RA: 1430482513038
 * - Jorge Luiz Barbosa da Silva RA: 1430482411013
 * - Juan dos Santos Alonso RA: 1430482513009
 * - Nicole Lira Nova Cardoso RA: 1430482513043
 */
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Processo {
  static int count = 0;
  private int protocolo;
  private String solicitante;
  private String tipoServico;
  private int prioridade;
  private String dataHora;

  public Processo(String solicitante, String tipoServico, int prioridade) {
    this.solicitante = solicitante;
    if (prioridade > 3 || prioridade < 1) {
      System.out.println("Erro prioridade deve ser entre 1 e 3");
      return;
    }
    this.prioridade = prioridade;
    this.tipoServico = tipoServico;
    this.protocolo = count++;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    this.dataHora = LocalDateTime.now().format(formatter);
  }

  // SETTERS E GETTERS
  public String getDataHora() {
    return dataHora;
  }

  public int getPrioridade() {
    return prioridade;
  }

  public int getProtocolo() {
    return protocolo;
  }

  public String getSolicitante() {
    return solicitante;
  }

  public String getTipoServico() {
    return tipoServico;
  }

  public void setDataHora(String dataHora) {
    this.dataHora = dataHora;
  }

  public void setPrioridade(int prioridade) {
    this.prioridade = prioridade;
  }

  public void setSolicitante(String solicitante) {
    this.solicitante = solicitante;
  }

  public void setTipoServico(String tipoServico) {
    this.tipoServico = tipoServico;
  }

  @Override
  public String toString() {
    return "[#" + protocolo + "] " + solicitante + " | " + tipoServico + " | " + prioridade + " | " + dataHora;
  }
}
