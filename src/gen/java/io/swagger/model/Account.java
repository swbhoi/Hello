package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Balance;
import io.swagger.model.Owners;
import java.util.ArrayList;
import java.util.List;



/**
 * Account Details
 **/

/**
 * Account Details
 */
@ApiModel(description = "Account Details")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-03-30T07:20:49.594Z")
public class Account   {
  private String id = null;

  private String label = null;

  private Long accNumber = null;

  private List<Owners> owners = new ArrayList<Owners>();

  private String type = null;

  private Balance balance = null;

  private String IBAN = null;

  private String swiftBic = null;

  private String bankId = null;

  public Account id(String id) {
    this.id = id;
    return this;
  }

   /**
   * ID
   * @return id
  **/
  @ApiModelProperty(value = "ID")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Account label(String label) {
    this.label = label;
    return this;
  }

   /**
   * label
   * @return label
  **/
  @ApiModelProperty(value = "label")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public Account accNumber(Long accNumber) {
    this.accNumber = accNumber;
    return this;
  }

   /**
   * Account number
   * @return accNumber
  **/
  @ApiModelProperty(value = "Account number")
  public Long getAccNumber() {
    return accNumber;
  }

  public void setAccNumber(Long accNumber) {
    this.accNumber = accNumber;
  }

  public Account owners(List<Owners> owners) {
    this.owners = owners;
    return this;
  }

  public Account addOwnersItem(Owners ownersItem) {
    this.owners.add(ownersItem);
    return this;
  }

   /**
   * owners
   * @return owners
  **/
  @ApiModelProperty(value = "owners")
  public List<Owners> getOwners() {
    return owners;
  }

  public void setOwners(List<Owners> owners) {
    this.owners = owners;
  }

  public Account type(String type) {
    this.type = type;
    return this;
  }

   /**
   * type
   * @return type
  **/
  @ApiModelProperty(value = "type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Account balance(Balance balance) {
    this.balance = balance;
    return this;
  }

   /**
   * balance
   * @return balance
  **/
  @ApiModelProperty(value = "balance")
  public Balance getBalance() {
    return balance;
  }

  public void setBalance(Balance balance) {
    this.balance = balance;
  }

  public Account IBAN(String IBAN) {
    this.IBAN = IBAN;
    return this;
  }

   /**
   * IBAN
   * @return IBAN
  **/
  @ApiModelProperty(value = "IBAN")
  public String getIBAN() {
    return IBAN;
  }

  public void setIBAN(String IBAN) {
    this.IBAN = IBAN;
  }

  public Account swiftBic(String swiftBic) {
    this.swiftBic = swiftBic;
    return this;
  }

   /**
   * swift_bic
   * @return swiftBic
  **/
  @ApiModelProperty(value = "swift_bic")
  public String getSwiftBic() {
    return swiftBic;
  }

  public void setSwiftBic(String swiftBic) {
    this.swiftBic = swiftBic;
  }

  public Account bankId(String bankId) {
    this.bankId = bankId;
    return this;
  }

   /**
   * bank_id
   * @return bankId
  **/
  @ApiModelProperty(value = "bank_id")
  public String getBankId() {
    return bankId;
  }

  public void setBankId(String bankId) {
    this.bankId = bankId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.id, account.id) &&
        Objects.equals(this.label, account.label) &&
        Objects.equals(this.accNumber, account.accNumber) &&
        Objects.equals(this.owners, account.owners) &&
        Objects.equals(this.type, account.type) &&
        Objects.equals(this.balance, account.balance) &&
        Objects.equals(this.IBAN, account.IBAN) &&
        Objects.equals(this.swiftBic, account.swiftBic) &&
        Objects.equals(this.bankId, account.bankId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, label, accNumber, owners, type, balance, IBAN, swiftBic, bankId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    accNumber: ").append(toIndentedString(accNumber)).append("\n");
    sb.append("    owners: ").append(toIndentedString(owners)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    IBAN: ").append(toIndentedString(IBAN)).append("\n");
    sb.append("    swiftBic: ").append(toIndentedString(swiftBic)).append("\n");
    sb.append("    bankId: ").append(toIndentedString(bankId)).append("\n");
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

