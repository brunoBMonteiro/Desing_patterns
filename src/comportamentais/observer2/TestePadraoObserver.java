package comportamentais.observer2;

public class TestePadraoObserver {

    public static void main(String[] args) {

        // Cria o Observer e o Subject
        AgenciaDeNoticias agenciaDeNoticias= new AgenciaDeNoticias();
        Radio radio = new Radio();

        // Registra o Observer com o Subject
        agenciaDeNoticias.registrar(radio);

        // Agora adicionamos algumas notícias
        agenciaDeNoticias.adicionaNoticia("Grêmio faz goleada histórica no Internacional.");
        agenciaDeNoticias.adicionaNoticia("Após humilhação histórica inter demite o seu treinador.");
        agenciaDeNoticias.adicionaNoticia("Torcida do internacional invade centro de treinamento após humilhação.");
        agenciaDeNoticias.adicionaNoticia("Quem manda no sul é Grêmio!");
    }
}
