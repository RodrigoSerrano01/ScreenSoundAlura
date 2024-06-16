package br.com.alura.screensound.model;

public enum TipoArtista {

    SOLO("Solo"),
    BANDA("banda"),
    DUPLA("dupla");

    private String tipo;


    TipoArtista(String tipo) {
        this.tipo = tipo;
    }

    public static TipoArtista fromString(String text) {
        for (TipoArtista categoria : TipoArtista.values()) {
            if (categoria.tipo.equalsIgnoreCase(text)) {
                return categoria;
            }
        }
        throw new IllegalArgumentException("Nenhuma categoria encontrada para a string fornecida: " + text);
    }
}
