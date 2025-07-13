import java.util.ArrayList;
import java.util.List;

public class Browser implements NavegadorInternet {
    private List<String> abas = new ArrayList<>();
    private String paginaAtual;
    private List<String> historico = new ArrayList<>();

    @Override
    public void exibirPagina(String url) {
        if (url.startsWith("http://") || url.startsWith("https://")) {
            paginaAtual = url;
            abas.add(url);
            historico.add("Exibindo página: " + url);
            System.out.println("Exibindo página: " + url);
        } else {
            historico.add("URL inválida: " + url);
            System.out.println("URL inválida!");
        }
    }

    @Override
    public void adicionarNovaAba() {
        abas.add("");
        historico.add("Nova aba adicionada");
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        historico.add("Página atualizada: " + paginaAtual);
        System.out.println("Página atualizada: " + paginaAtual);
    }

    public List<String> getAbas() {
        return abas;
    }

    public List<String> getHistorico() {
        return historico;
    }
}
