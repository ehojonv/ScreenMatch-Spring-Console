package br.com.alura.screenmatch.model;

public enum Categoria {
    ACAO("Action", "Ação"),
    ROMANCE("Romance", "Romance"),
    COMEDIA("Comedy", "Comédia"),
    DRAMA("Drama", "Drama"),
    CRIME("Crime", "Crime"),
    ANIMAÇÃO("Animation", "Animação"),
    AVENTURA("Adventure", "Aventura");

    private final String categoriaOmdb;
    private String categoriaPtbr;

    Categoria(String categoriaOmdb, String categoriaPtbr){
        this.categoriaOmdb = categoriaOmdb;
        this.categoriaPtbr = categoriaPtbr;
    }

    public static Categoria fromString(String text) {
        for (Categoria categoria : Categoria.values()) {
            if (categoria.categoriaOmdb.equalsIgnoreCase(text)) {
                return categoria;
            }
        }
        throw new IllegalArgumentException("Nenhuma categoria encontrada para a string fornecida: " + text);
    }

    public static Categoria fromPtbr(String text) {
        for (Categoria categoria : Categoria.values()) {
            if (categoria.categoriaPtbr.equalsIgnoreCase(text)) {
                return categoria;
            }
        }
        throw new IllegalArgumentException("Nenhuma categoria encontrada para a string fornecida: " + text);
    }

}
