package uni1a;

import java.util.ArrayList;

public class Episodio {

    private String titulo;
    private int numero; // número del episodio dentro de la temporada
    private int duracion; // en minutos
    private String sinopsis;
    private ArrayList<Actor> reparto; // actores que participaron

    // Constructor
    public Episodio(String titulo, int numero, int duracion, String sinopsis) {
        this.titulo = titulo;
        this.numero = numero;
        this.duracion = duracion;
        this.sinopsis = sinopsis;
        this.reparto = new ArrayList<>();
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public ArrayList<Actor> getReparto() {
        return reparto;
    }

    public void agregarActor(Actor actor) {
        this.reparto.add(actor);
    }
}
