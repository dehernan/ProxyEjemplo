package ar.edu.untref.aydoo;

import org.junit.Test;
import org.junit.Assert;


public class TestIntegracion{

    @Test
    public void usuarioMayorALaEdadMinimaRequerida(){
        ReproductorDeVideoReal reproductorDeVideoReal = new ReproductorDeVideoReal();
        ReproductorDeVideoProxy reproductorDeVideoProxy = new ReproductorDeVideoProxy(reproductorDeVideoReal);
        Video video = new Video("urlVideo", 18);
        Usuario usuario = new Usuario("Lucas", 20, reproductorDeVideoProxy);

        String respuesta = usuario.reproducirVideo(video);

        Assert.assertEquals("El video se esta reproduciendo...", respuesta);
    }

    @Test
    public void usuarioMenorALaEdadMinimaRequerida(){
        ReproductorDeVideoReal reproductorDeVideoReal = new ReproductorDeVideoReal();
        ReproductorDeVideoProxy reproductorDeVideoProxy = new ReproductorDeVideoProxy(reproductorDeVideoReal);
        Video video = new Video("urlVideo", 18);
        Usuario usuario = new Usuario("Lucas", 15, reproductorDeVideoProxy);

        String respuesta = usuario.reproducirVideo(video);

        Assert.assertEquals("No cumple con la restriccion de edad para ver este video...", respuesta);
    }

    @Test
    public void usuarioConLaMismaEdadaQueLaMinimaRequerida(){
        ReproductorDeVideoReal reproductorDeVideoReal = new ReproductorDeVideoReal();
        ReproductorDeVideoProxy reproductorDeVideoProxy = new ReproductorDeVideoProxy(reproductorDeVideoReal);
        Video video = new Video("urlVideo", 13);
        Usuario usuario = new Usuario("Lucas", 13, reproductorDeVideoProxy);

        String respuesta = usuario.reproducirVideo(video);

        Assert.assertEquals("El video se esta reproduciendo...", respuesta);
    }
}
