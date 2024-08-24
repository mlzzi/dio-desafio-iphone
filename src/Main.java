import iphone.aparelhoMultifuncional.AparelhoMultifuncional;

public class Main {
    public static void main(String[] args) {

        AparelhoMultifuncional iphone = new AparelhoMultifuncional();

        String numero = "123456789";
        String musica = "Bohemian Rhapsody - Queen";
        String url = "https://github.com/mlzzi";

        iphone.ligar(numero);
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.exibirPagina(url);
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.tocar(musica);
        iphone.pausar();
        iphone.selecionarMusica();

    }
}