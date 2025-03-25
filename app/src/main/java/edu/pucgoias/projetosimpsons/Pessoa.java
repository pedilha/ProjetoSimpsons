package edu.pucgoias.projetosimpsons;

public class Pessoa {
    private String nome;
    private String marca;
    private String descricao;
    private String img;

    private String imgav;

    public Pessoa(String nome, String marca, String descricao, String img,String imgav) {
        this.nome = nome;
        this.marca = marca;
        this.descricao = descricao;
        this.img = img;
        this.imgav =imgav;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String matricula) {
        this.marca = matricula;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String status) {
        this.descricao = status;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getImgav() {
        return imgav;
    }

    public void setImgav(String img) {
        this.imgav = imgav;
    }
}
