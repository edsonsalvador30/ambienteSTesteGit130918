package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela CADASTRO
 * @generated
 */
@Entity
@Table(name = "\"CADASTRO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Cadastro")
public class Cadastro implements Serializable {

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
  @Column(name = "nome_cliente", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nome_cliente;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "ano", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date ano;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "mes", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date mes;

  /**
  * @generated
  */
  @Column(name = "renda", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double renda;

  /**
   * Construtor
   * @generated
   */
  public Cadastro(){
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
  public Cadastro setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém nome_cliente
   * return nome_cliente
   * @generated
   */
  
  public java.lang.String getNome_cliente(){
    return this.nome_cliente;
  }

  /**
   * Define nome_cliente
   * @param nome_cliente nome_cliente
   * @generated
   */
  public Cadastro setNome_cliente(java.lang.String nome_cliente){
    this.nome_cliente = nome_cliente;
    return this;
  }

  /**
   * Obtém ano
   * return ano
   * @generated
   */
  
  public java.util.Date getAno(){
    return this.ano;
  }

  /**
   * Define ano
   * @param ano ano
   * @generated
   */
  public Cadastro setAno(java.util.Date ano){
    this.ano = ano;
    return this;
  }

  /**
   * Obtém mes
   * return mes
   * @generated
   */
  
  public java.util.Date getMes(){
    return this.mes;
  }

  /**
   * Define mes
   * @param mes mes
   * @generated
   */
  public Cadastro setMes(java.util.Date mes){
    this.mes = mes;
    return this;
  }

  /**
   * Obtém renda
   * return renda
   * @generated
   */
  
  public java.lang.Double getRenda(){
    return this.renda;
  }

  /**
   * Define renda
   * @param renda renda
   * @generated
   */
  public Cadastro setRenda(java.lang.Double renda){
    this.renda = renda;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Cadastro object = (Cadastro)obj;
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
