package com.demoama.ama01.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Usuario {
  //Atributos
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String nome;
  private String telefone;
  private String cpf;
  private String rua;
  private String bairro;
  private String cidade;
  private String numero;
  private String nomeCompleto;

  //Construtor
  public Usuario(int id, 
                String nome, 
                String telefone, 
                String cpf, 
                String rua, 
                String bairro, 
                String cidade, 
                String numero,

String nomeCompleto){
    this.setId(id);
    this.setNome(nome);
    this.setTelefone(telefone);
    this.setCpf(cpf);
    this.setRua(rua);
    this.setBairro(bairro);
    this.setCidade(cidade);
    this.setNumero(numero);
    this.setNomeCompleto(nomeCompleto);
  }

  public Usuario(){
                                                                
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

  public String getNumero(){
    return numero;
  }
  public void setNumero(String numero){
    this.numero = numero;
  }

  public String getNomeCompleto(){
    return nomeCompleto;
  }
  public void setNomeCompleto(String nomeCompleto){
    this.nomeCompleto = nomeCompleto;
  }

}
