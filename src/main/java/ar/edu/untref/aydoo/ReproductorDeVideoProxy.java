package ar.edu.untref.aydoo;

public class ReproductorDeVideoProxy extends ReproductorDeVideo{

    ReproductorDeVideoReal reproductorDeVideoReal;

    public ReproductorDeVideoProxy(ReproductorDeVideoReal reproductorDeVideoReal){
        this.reproductorDeVideoReal = reproductorDeVideoReal;
    }

    @Override
    public String reproducir(Usuario usuario, Video video) {
        if (usuario.getEdad() >= video.getEdadMinimaParaVerlo()) {
            return video.reproducir();
        }else {
            return "No cumple con la restriccion de edad para ver este video...";
        }

    }
}
