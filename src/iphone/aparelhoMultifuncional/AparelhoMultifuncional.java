package iphone.aparelhoMultifuncional;

import iphone.interfaces.AparelhoTelefonico;
import iphone.interfaces.NavegadorInternet;
import iphone.interfaces.ReprodutorMusical;

public class AparelhoMultifuncional implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    public void ligar(String numero) {
        System.out.println("Ligando para o número " + numero);
    }

    public void atender() {
        System.out.println("Atendendo Ligação");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz");
    }

    public void exibirPagina(String url) {
        System.out.println("Acessando a página " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Nova Aba Aberta");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando Página");
    }

    public void tocar(String musica) {
        System.out.println("Tocando a música " + musica);
    }

    public void pausar() {
        System.out.println("Pausar Música");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando Música");
    }
}
