public class ApareloTelefonico {
    private int numeroTelefone = 99998888;

    public void ligar(int numeroTelefone){
        System.out.println("Ligando para o numero "+ numeroTelefone);
    }
    public void atender(){
        System.out.println("Ligação atendida.");
    }
    public void desligar(){
        System.out.println("Desligando ligação...");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Correio de voz ativado!");
        System.out.println("Deixe sua mensagem...");
    }
}
