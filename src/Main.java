import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        Scanner scanner = new Scanner(System.in);
        boolean executando = true;

        System.out.println("Bem-vindo ao iPhone Simulado!");
        while (executando) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Selecionar música");
            System.out.println("2 - Tocar música");
            System.out.println("3 - Pausar música");
            System.out.println("4 - Ligar para número");
            System.out.println("5 - Atender chamada");
            System.out.println("6 - Iniciar correio de voz");
            System.out.println("7 - Exibir página web");
            System.out.println("8 - Adicionar nova aba");
            System.out.println("9 - Atualizar página");
            System.out.println("10 - Mostrar histórico de ações");
            System.out.println("0 - Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome da música: ");
                    String musica = scanner.nextLine();
                    iphone.selecionarMusica(musica);
                    break;
                case 2:
                    iphone.tocar();
                    break;
                case 3:
                    iphone.pausar();
                    break;
                case 4:
                    System.out.print("Digite o número: ");
                    String numero = scanner.nextLine();
                    iphone.ligar(numero);
                    break;
                case 5:
                    iphone.atender();
                    break;
                case 6:
                    iphone.iniciarCorreioVoz();
                    break;
                case 7:
                    System.out.print("Digite a URL: ");
                    String url = scanner.nextLine();
                    iphone.exibirPagina(url);
                    break;
                case 8:
                    iphone.adicionarNovaAba();
                    break;
                case 9:
                    iphone.atualizarPagina();
                    break;
                case 10:
                    System.out.println("\nHistórico de ações:");
                    for (String acao : iphone.getHistorico()) {
                        System.out.println(acao);
                    }
                    break;
                case 0:
                    executando = false;
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        scanner.close();

        
    }
}
