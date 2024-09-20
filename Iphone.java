public class Iphone {
    public String musicaEscolhida = "alma vazia";

    public static void main(String[] args) {
        Iphone iphone = new Iphone();  // Instância da classe Iphone
        MusicPlayer player = new MusicPlayer();  // Instância do player
        ApareloTelefonico telefone = new ApareloTelefonico();
        NavegadorInternet internet = new NavegadorInternet();

        player.selecionarMusica(iphone.musicaEscolhida);  // Passando a música do iphone
        player.tocar();  // Tocando a música
        player.pausar();

        telefone.ligar(994639247);
        telefone.atender();
        telefone.desligar();
        telefone.iniciarCorreioVoz();

        internet.exibirPagina("https://github.com/z4mbrano/iphone-simples");
        internet.adicionarNovaAba();
        internet.atualizarPagina();
    }
}