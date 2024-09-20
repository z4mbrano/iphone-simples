public class MusicPlayer {
    private String musica = "Lixo";  // Mantém a variável privada

    public void selecionarMusica(String musicaEscolhida){
        this.musica = musicaEscolhida;
        System.out.println("Música escolhida: " + musica);
    }

    public void tocar(){
        System.out.println("Tocando " + musica + "...");
    }

    public void pausar(){
        System.out.println("Música pausada.");
    }
}