package com.demoama.ama01.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Conteudos {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idC;
    private String nomeC;
    private String conteudoC;
    private String profissaoC;
    private String estrelasC;
    private String tituloC;
    private String descricaoC;
    private String precoC;
    private String tempoC;
    private String imagemC;


    //Construtor
    public Conteudos(int idC, String nomeC, String conteudoC, String profissaoC, String estrelasC, String tituloC, String descricaoC, String precoC, String tempoC, String imagemC){
        this.setIdC(idC);
        this.setNomeC(nomeC);
        this.setConteudoC(conteudoC);
        this.setProfissaoC(profissaoC);
        this.setEstrelasC(estrelasC);
        this.setTituloC(tituloC);
        this.setDescricaoC(descricaoC);
        this.setPrecoC(precoC);
        this.setTempoC(tempoC);
        this.setImagemC(imagemC);
    }

    public Conteudos(){

    }

    //Metodos Get e Set
    public int getIdC() {
        return idC;
    }

    public void setIdC(int idC) {
        this.idC = idC;
    }

    public String getNomeC() {
        return nomeC;
    }
    public void setNomeC(String nomeC) {
        this.nomeC = nomeC;
    }

    public String getConteudoC() {
        return conteudoC;
    }
    public void setConteudoC(String conteudoC) {
        this.conteudoC = conteudoC;
    }

    public String getProfissaoC() {
        return profissaoC;
    }
    public void setProfissaoC(String profissaoC) {
        this.profissaoC = profissaoC;
    }

    public String getEstrelasC() {
        return estrelasC;
    }
    public void setEstrelasC(String estrelasC) {
        this.estrelasC = estrelasC;
    }

    public String getTituloC() {
        return tituloC;
    }
    public void setTituloC(String tituloC) {
        this.tituloC = tituloC;
    }

    public String getDescricaoC() {
        return descricaoC;
    }
    public void setDescricaoC(String descricaoC) {
        this.descricaoC = descricaoC;
    }

    public String getPrecoC() {
        return precoC;
    }
    public void setPrecoC(String precoC) {
        this.precoC = precoC;
    }

    public String getTempoC() {
        return tempoC;
    }
    public void setTempoC(String tempoC) {
        this.tempoC = tempoC;
    }

    public String getImagemC() {
        return imagemC;
    }
    public void setImagemC(String imagemC) {
        this.imagemC = imagemC;
    }
}
