package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * SetCardStatus
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-22T20:46:46.763Z")
public class SetCardStatus {
  /**
   * Novo status do cartão para o qual se deseja alterar
   */
  public enum StatusEnum {
    @SerializedName("bloqueado")
    BLOQUEADO("bloqueado"),
    
    @SerializedName("desbloqueado")
    DESBLOQUEADO("desbloqueado");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("status")
  private StatusEnum status = StatusEnum.DESBLOQUEADO;

  public SetCardStatus status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Novo status do cartão para o qual se deseja alterar
   * @return status
  **/
  @ApiModelProperty(value = "Novo status do cartão para o qual se deseja alterar")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetCardStatus setCardStatus = (SetCardStatus) o;
    return Objects.equals(this.status, setCardStatus.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetCardStatus {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

