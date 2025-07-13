import java.util.ArrayList;
import java.util.List;

public class Player implements ReprodutorMusical {
    private String musicaAtual;
    private List<String> historico = new ArrayList<>();

    @Override
    public void tocar() {
        historico.add("Tocando música: " + musicaAtual);
        System.out.println("Tocando música: " + musicaAtual);
    }

    @Override
    public void pausar() {
        historico.add("Música pausada: " + musicaAtual);
        System.out.println("Música pausada: " + musicaAtual);
    }

    @Override
    public void selecionarMusica(String musica) {
        musicaAtual = musica;
        historico.add("Selecionando música: " + musica);
        System.out.println("Selecionando música: " + musica);
    }

    public List<String> getHistorico() {
        return historico;
    }
}
