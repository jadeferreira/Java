package minhasmusicas.principal;

import minhasmusicas.modelos.Audio;
import minhasmusicas.modelos.MinhasPreferidas;
import minhasmusicas.modelos.Musica;
import minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {

        Musica musica = new Musica();
        musica.setTitulo("Shake it off");
        musica.setCantor("Taylor Swift");

        for (int i = 0; i < 2000 ; i++) {
            musica.reproduz();
        }

        for (int i = 0; i < 4000; i++) {
            musica.curte();
        }

        Podcast podcast = new Podcast();
        podcast.setTitulo("BolhaDev");
        podcast.setHost("Marcus Mendes");

        for (int i = 0; i < 5000; i++) {
            podcast.reproduz();
        }

        for (int i = 0; i < 6000; i++) {
            podcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(podcast);
        preferidas.inclui(musica);

    }
}
