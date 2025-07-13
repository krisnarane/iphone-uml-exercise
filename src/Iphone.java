import java.util.ArrayList;
import java.util.List;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private Player player = new Player();
    private Telefone telefone = new Telefone();
    private Browser browser = new Browser();

    @Override
    public void tocar() {
        player.tocar();
    }

    @Override
    public void pausar() {
        player.pausar();
    }

    @Override
    public void selecionarMusica(String musica) {
        player.selecionarMusica(musica);
    }

    @Override
    public void ligar(String numero) {
        telefone.ligar(numero);
    }

    @Override
    public void atender() {
        telefone.atender();
    }

    @Override
    public void iniciarCorreioVoz() {
        telefone.iniciarCorreioVoz();
    }

    @Override
    public void exibirPagina(String url) {
        browser.exibirPagina(url);
    }

    @Override
    public void adicionarNovaAba() {
        browser.adicionarNovaAba();
    }

    @Override
    public void atualizarPagina() {
        browser.atualizarPagina();
    }

    public List<String> getHistorico() {
        List<String> historico = new ArrayList<>();
        historico.addAll(player.getHistorico());
        historico.addAll(telefone.getHistorico());
        historico.addAll(browser.getHistorico());
        return historico;
    }
}
