package ar.edu.untref.aydoo;

public class Usuario {

    private String nombre;
    private int edad;
    private ReproductorDeVideo reproductorDeVideo;

    public Usuario(String nombre, int edad, ReproductorDeVideoProxy reproductorDeVideo){
        this.nombre = nombre;
        this.edad = edad;
        this.reproductorDeVideo = reproductorDeVideo;
    }

    public int getEdad(){
        return this.edad;
    }

    public String reproducirVideo(Video video){
        return reproductorDeVideo.reproducir(this, video);
    }
}
