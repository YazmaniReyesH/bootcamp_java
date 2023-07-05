import java.util.Arrays;

public class Canciones {
    private int id;
    private String titulo;
    private String artista;
    private String genero;
    private String duracion;

    public Canciones(){

    }

    public Canciones(int id, String titulo, String artista, String genero, String duracion) {
        this.id = id;
        this.titulo = titulo;
        this.artista = artista;
        this.genero = genero;
        this.duracion = duracion;
    }

    public int getId() {
        return id;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getArtista() {
        return artista;
    }
    public String getGenero() {
        return genero;
    }
    public String getDuracion() {
        return duracion;
    }

    public String mostrarInformacionCancion(){
        return "**************************************" + "\n" +
                "Id: " + id + "\n" +
                "Titulo: " + titulo + "\n" +
                "Artista: " + artista + "\n" +
                "Genero: " + genero + "\n" +
                "Duracion: " + duracion + "\n" +
                "**************************************";
    }
}
