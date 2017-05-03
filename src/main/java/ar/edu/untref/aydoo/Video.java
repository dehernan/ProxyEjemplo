package ar.edu.untref.aydoo;

public class Video {

    private String urlVideo;
    private int edadMinimaParaVerlo;

    public Video(String urlVideo, int edadMinimaParaVerlo){
        this.urlVideo = urlVideo;
        this.edadMinimaParaVerlo = edadMinimaParaVerlo;
    }

    public int getEdadMinimaParaVerlo() {
        return edadMinimaParaVerlo;
    }

    public String reproducir(){
        return "El video se esta reproduciendo...";
    }
}
