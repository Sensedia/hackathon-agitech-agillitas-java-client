package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.NovoCartaoPortadorContato;
import io.swagger.client.model.NovoCartaoPortadorEndereco;
import org.joda.time.LocalDate;

/**
 * NovoCartaoPortador
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-22T20:46:46.763Z")
public class NovoCartaoPortador {
  @SerializedName("nome")
  private String nome = null;

  @SerializedName("sobrenome")
  private String sobrenome = null;

  @SerializedName("dataNascimento")
  private LocalDate dataNascimento = null;

  @SerializedName("cpf")
  private String cpf = null;

  @SerializedName("contato")
  private NovoCartaoPortadorContato contato = null;

  @SerializedName("endereco")
  private NovoCartaoPortadorEndereco endereco = null;

  public NovoCartaoPortador nome(String nome) {
    this.nome = nome;
    return this;
  }

   /**
   * Nome do portador do cartão.
   * @return nome
  **/
  @ApiModelProperty(example = "João", value = "Nome do portador do cartão.")
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public NovoCartaoPortador sobrenome(String sobrenome) {
    this.sobrenome = sobrenome;
    return this;
  }

   /**
   * Sobrenome do portador do cartão.
   * @return sobrenome
  **/
  @ApiModelProperty(example = "Silva", value = "Sobrenome do portador do cartão.")
  public String getSobrenome() {
    return sobrenome;
  }

  public void setSobrenome(String sobrenome) {
    this.sobrenome = sobrenome;
  }

  public NovoCartaoPortador dataNascimento(LocalDate dataNascimento) {
    this.dataNascimento = dataNascimento;
    return this;
  }

   /**
   * Data de nascimento do portador do cartão (YYYY-MM-DD).
   * @return dataNascimento
  **/
  @ApiModelProperty(example = "1985-09-24", value = "Data de nascimento do portador do cartão (YYYY-MM-DD).")
  public LocalDate getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(LocalDate dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  public NovoCartaoPortador cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }

   /**
   * Numero do cadastro de pessoas física do portador.  Não deve conter pontos ou hífen.
   * @return cpf
  **/
  @ApiModelProperty(example = "12312312312", value = "Numero do cadastro de pessoas física do portador.  Não deve conter pontos ou hífen.")
  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public NovoCartaoPortador contato(NovoCartaoPortadorContato contato) {
    this.contato = contato;
    return this;
  }

   /**
   * Get contato
   * @return contato
  **/
  @ApiModelProperty(value = "")
  public NovoCartaoPortadorContato getContato() {
    return contato;
  }

  public void setContato(NovoCartaoPortadorContato contato) {
    this.contato = contato;
  }

  public NovoCartaoPortador endereco(NovoCartaoPortadorEndereco endereco) {
    this.endereco = endereco;
    return this;
  }

   /**
   * Get endereco
   * @return endereco
  **/
  @ApiModelProperty(value = "")
  public NovoCartaoPortadorEndereco getEndereco() {
    return endereco;
  }

  public void setEndereco(NovoCartaoPortadorEndereco endereco) {
    this.endereco = endereco;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NovoCartaoPortador novoCartaoPortador = (NovoCartaoPortador) o;
    return Objects.equals(this.nome, novoCartaoPortador.nome) &&
        Objects.equals(this.sobrenome, novoCartaoPortador.sobrenome) &&
        Objects.equals(this.dataNascimento, novoCartaoPortador.dataNascimento) &&
        Objects.equals(this.cpf, novoCartaoPortador.cpf) &&
        Objects.equals(this.contato, novoCartaoPortador.contato) &&
        Objects.equals(this.endereco, novoCartaoPortador.endereco);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, sobrenome, dataNascimento, cpf, contato, endereco);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NovoCartaoPortador {\n");
    
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    sobrenome: ").append(toIndentedString(sobrenome)).append("\n");
    sb.append("    dataNascimento: ").append(toIndentedString(dataNascimento)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    contato: ").append(toIndentedString(contato)).append("\n");
    sb.append("    endereco: ").append(toIndentedString(endereco)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

