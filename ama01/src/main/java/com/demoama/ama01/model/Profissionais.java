package com.demoama.ama01.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Profissionais {
    //Atributos
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)  
  private int id;
  private String nome;
  private String profissao;
  private String telefone;
  private String cpf;
  private String rua;
  private String bairro;
  private String cidade;
  private String premium;
  private String numero;
  private String estrelas;
  private String imagem;
  

  //Construtor
  public Profissionais(int id, String nome, String profissao, String telefone, String cpf, String rua, String bairro, String cidade, String premium, String numero, String estrelas, String imagem){
    this.setId(id);
    this.setNome(nome);
    this.setProfissao(profissao);
    this.setTelefone(telefone);
    this.setCpf(cpf);
    this.setRua(rua);
    this.setBairro(bairro);
    this.setCidade(cidade);
    this.setPremium(premium);
    this.setNumero(numero);
    this.setEstrelas(estrelas);
    this.setImagem(imagem);
  }

  public Profissionais(){
    
  }

  //Metodos
  public int getId(){
    return id;
  }
  public void setId(int id){
    this.id = id;
  }

  public String getNome(){
    return nome;
  }
  public void setNome(String nome){
    this.nome = nome;
  }
  
  public String getProfissao(){
    return profissao;
  }
  public void setProfissao(String profissao){
    this.profissao = profissao;
  }

  public String getTelefone(){
    return telefone;
  }
  public void setTelefone(String telefone){
    this.telefone = telefone;
  }

  public String getCpf(){
    return cpf;
  }
  public void setCpf(String cpf){
    this.cpf = cpf;
  }

  public String getRua(){
    return rua;
  }
  public void setRua(String rua){
    this.rua = rua;
  }

  public String getBairro(){
    return bairro;
  }
  public void setBairro(String bairro){
    this.bairro = bairro;
  }

  public String getCidade(){
    return cidade;
  }
  public void setCidade(String cidade){
    this.cidade = cidade;
  }

    public String getPremium(){
      return premium;
    }
    public void setPremium(String premium){
      this.premium = premium;
    }

    public String getNumero(){
      return numero;
    }
    public void setNumero(String numero){
      this.numero = numero;
    }

    public String getEstrelas(){
      return estrelas;
    }
    public void setEstrelas(String estrelas){
      this.estrelas = estrelas;
    }

    public String getImagem(){
      return imagem;
    }
    public void setImagem(String imagem){
      this.imagem = imagem;
    }
}
