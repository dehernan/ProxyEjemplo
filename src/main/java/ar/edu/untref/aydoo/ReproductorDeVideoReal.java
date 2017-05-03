package ar.edu.untref.aydoo;

public class ReproductorDeVideoReal extends ReproductorDeVideo {

    @Override
    public String reproducir(Usuario usuario, Video video) {
        return video.reproducir();
    }
}
