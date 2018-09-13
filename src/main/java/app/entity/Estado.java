package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela ESTADO
 * @generated
 */
@Entity
@Table(name = "\"ESTADO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Estado")
public class Estado implements Serializable {

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
  @Column(name = "nome_estado", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nome_estado;

  /**
   * Construtor
   * @generated
   */
  public Estado(){
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
  public Estado setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém nome_estado
   * return nome_estado
   * @generated
   */
  
  public java.lang.String getNome_estado(){
    return this.nome_estado;
  }

  /**
   * Define nome_estado
   * @param nome_estado nome_estado
   * @generated
   */
  public Estado setNome_estado(java.lang.String nome_estado){
    this.nome_estado = nome_estado;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Estado object = (Estado)obj;
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
