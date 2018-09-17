package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela CONTRATOS
 * @generated
 */
@Entity
@Table(name = "\"CONTRATOS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Contratos")
public class Contratos implements Serializable {

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
  @Column(name = "ativo", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Boolean ativo;

  /**
   * Construtor
   * @generated
   */
  public Contratos(){
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
  public Contratos setId(java.lang.String id){
    this.id = id;
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
  public Contratos setAno(java.lang.Integer ano){
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
  public Contratos setMes(java.lang.Integer mes){
    this.mes = mes;
    return this;
  }

  /**
   * Obtém ativo
   * return ativo
   * @generated
   */
  
  public java.lang.Boolean getAtivo(){
    return this.ativo;
  }

  /**
   * Define ativo
   * @param ativo ativo
   * @generated
   */
  public Contratos setAtivo(java.lang.Boolean ativo){
    this.ativo = ativo;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Contratos object = (Contratos)obj;
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
