package br.com.alura.screensound.model;


import jakarta.persistence.*;


@Entity
@Table(name = "artistas")
public class Musica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String titulo;

    @ManyToOne
    private Artista artista;


    public Musica(String titulo) {
        this.titulo = titulo;
    }

    public Musica() {
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return " Musica: "+  titulo;
    }
}
