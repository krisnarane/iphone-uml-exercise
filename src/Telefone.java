import java.util.ArrayList;
import java.util.List;

public class Telefone implements AparelhoTelefonico {
    private String numeroEmChamada;
    private List<String> historico = new ArrayList<>();

    @Override
    public void ligar(String numero) {
        if (numero.matches("\\(\\d{2}\\) \\d{5}-\\d{4}")) {
            numeroEmChamada = numero;
            historico.add("Ligando para: " + numero);
            System.out.println("Ligando para: " + numero);
        } else {
            historico.add("Número inválido: " + numero);
            System.out.println("Número inválido!");
        }
    }

    @Override
    public void atender() {
        historico.add("Atendendo chamada de: " + numeroEmChamada);
        System.out.println("Atendendo chamada de: " + numeroEmChamada);
    }

    @Override
    public void iniciarCorreioVoz() {
        historico.add("Iniciando correio de voz");
        System.out.println("Iniciando correio de voz...");
    }

    public List<String> getHistorico() {
        return historico;
    }
}
