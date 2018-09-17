package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela CARRO
 * @generated
 */
@Entity
@Table(name = "\"CARRO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Carro")
public class Carro implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Column(name = "Empresa", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String empresa;

  /**
  * @generated
  */
  @Column(name = "Modelo", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String modelo;

  /**
  * @generated
  */
  @Column(name = "ano", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer ano;

  /**
  * @generated
  */
  @Column(name = "mes", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer mes;

  /**
  * @generated
  */
  @Column(name = "disponivel", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Boolean disponivel;

  /**
  * @generated
  */
  @Column(name = "valor", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double valor;

  /**
   * Construtor
   * @generated
   */
  public Carro(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public Carro setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém empresa
   * return empresa
   * @generated
   */
  
  public java.lang.String getEmpresa(){
    return this.empresa;
  }

  /**
   * Define empresa
   * @param empresa empresa
   * @generated
   */
  public Carro setEmpresa(java.lang.String empresa){
    this.empresa = empresa;
    return this;
  }

  /**
   * Obtém modelo
   * return modelo
   * @generated
   */
  
  public java.lang.String getModelo(){
    return this.modelo;
  }

  /**
   * Define modelo
   * @param modelo modelo
   * @generated
   */
  public Carro setModelo(java.lang.String modelo){
    this.modelo = modelo;
    return this;
  }

  /**
   * Obtém ano
   * return ano
   * @generated
   */
  
  public java.lang.Integer getAno(){
    return this.ano;
  }

  /**
   * Define ano
   * @param ano ano
   * @generated
   */
  public Carro setAno(java.lang.Integer ano){
    this.ano = ano;
    return this;
  }

  /**
   * Obtém mes
   * return mes
   * @generated
   */
  
  public java.lang.Integer getMes(){
    return this.mes;
  }

  /**
   * Define mes
   * @param mes mes
   * @generated
   */
  public Carro setMes(java.lang.Integer mes){
    this.mes = mes;
    return this;
  }

  /**
   * Obtém disponivel
   * return disponivel
   * @generated
   */
  
  public java.lang.Boolean getDisponivel(){
    return this.disponivel;
  }

  /**
   * Define disponivel
   * @param disponivel disponivel
   * @generated
   */
  public Carro setDisponivel(java.lang.Boolean disponivel){
    this.disponivel = disponivel;
    return this;
  }

  /**
   * Obtém valor
   * return valor
   * @generated
   */
  
  public java.lang.Double getValor(){
    return this.valor;
  }

  /**
   * Define valor
   * @param valor valor
   * @generated
   */
  public Carro setValor(java.lang.Double valor){
    this.valor = valor;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Carro object = (Carro)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
