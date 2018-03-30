package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Account owners
 **/

/**
 * Account owners
 */
@ApiModel(description = "Account owners")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-03-30T07:20:49.594Z")
public class Owners   {
  private String provider = null;

  private String displayName = null;

  private String id = null;

  public Owners provider(String provider) {
    this.provider = provider;
    return this;
  }

   /**
   * provider
   * @return provider
  **/
  @ApiModelProperty(value = "provider")
  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
  }

  public Owners displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * display name
   * @return displayName
  **/
  @ApiModelProperty(value = "display name")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public Owners id(String id) {
    this.id = id;
    return this;
  }

   /**
   * id
   * @return id
  **/
  @ApiModelProperty(value = "id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Owners owners = (Owners) o;
    return Objects.equals(this.provider, owners.provider) &&
        Objects.equals(this.displayName, owners.displayName) &&
        Objects.equals(this.id, owners.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(provider, displayName, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Owners {\n");
    
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

