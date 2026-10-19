package com.example.demo.model;

public class Musica {
    private int id;
    private String nome;
    private String autor;
    private int duracao;
    private String genero;

    @Override
    public String toString() {
        return "Musica{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", autor='" + autor + '\'' +
                ", duracao=" + duracao +
                ", genero='" + genero + '\'' +
                '}';
    }

    public Musica(int id, String nome, String autor, int duracao, String genero) {
        this.id = id;
        this.nome = nome;
        this.autor = autor;
        this.duracao = duracao;
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
