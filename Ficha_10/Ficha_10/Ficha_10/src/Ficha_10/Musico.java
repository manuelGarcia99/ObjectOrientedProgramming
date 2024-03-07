package Ficha_10;

public class Musico {
    private String nome;
    private String desc;
    private String genre;

    Musico(String nome, String desc, String genre){
        this.nome=nome;
        this.desc= desc;
        this.genre= genre;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Musico musico = (Musico) o;
        return nome.equals(musico.nome) && desc.equals(musico.desc) && genre.equals(musico.genre);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
