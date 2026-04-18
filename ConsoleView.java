
import java.util.Scanner;

public class ConsoleView {
    private Scanner scn = new Scanner(System.in);
    private CentralAtendimento central = new CentralAtendimento();

    public void abrirProcesso() {
        System.out.println("Digite o nome do solicitante:");
        String solicitante = scn.nextLine();

        System.out.println("Digite o tipo de servico:");
        String tipoServico = scn.nextLine();

        System.out.println("Digite a prioridade (1 a 3):");
        int prioridade = scn.nextInt();
        scn.nextLine();

        Processo processo = new Processo(solicitante, tipoServico, prioridade);
        if (prioridade < 1 || prioridade > 3) {
            System.out.println("Prioridade deve ser entre 1 e 3.");
            return;
        }

        central.abrirProcesso(processo);
        System.out.println("Processo aberto: " + processo);
    }

    public void atenderProximo() {
        Processo processo = central.atenderProximo();
        System.out.println("Atendendo processo: " + processo);
    }

    public void desfazerUltimoAtendimento() {
        Processo processo = central.desfazerUltimoAtendimento();
        System.out.println("Desfeito atendimento do processo: " + processo);
    }

    public void listarPendentes() {
        System.out.println("Processos pendentes:");
        central.listarPendentes();
    }

    public void listarHistorico() {
        System.out.println("Historico de atendimentos:");
        central.listarHistorico();
    }

    public void exibirMenu() {
        int input = 0;
        do {
            System.out.println("Digite uma opcao abaixo: ");
            System.out.println("1- Abrir processo");
            System.out.println("2- Atender proximo");
            System.out.println("3- Desfazer atendimento anterior");
            System.out.println("4- Listar pendentes");
            System.out.println("5- Listar historico");
            System.out.println("6- Sair");
            input = scn.nextInt();
            scn.nextLine();

            switch (input) {
                case 1:
                    abrirProcesso();
                    break;
                case 2:
                    atenderProximo();
                    break;
                case 3:
                    desfazerUltimoAtendimento();
                    break;
                case 4:
                    listarPendentes();
                    break;
                case 5:
                    listarHistorico();
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (input != 6);
    }
}
