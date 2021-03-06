/*
 * Fortify Software Security Center API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1:18.20
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.fortify.ssc.restclient.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * A project or application on the server
 */
@ApiModel(description = "A project or application on the server")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-09T13:54:27.094-07:00")
public class Project {
  @SerializedName("createdBy")
  private String createdBy = null;

  @SerializedName("creationDate")
  private OffsetDateTime creationDate = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("issueTemplateId")
  private String issueTemplateId = null;

  @SerializedName("name")
  private String name = null;

  public Project createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * User that created this project
   * @return createdBy
  **/
  @ApiModelProperty(required = true, value = "User that created this project")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

   /**
   * Date created
   * @return creationDate
  **/
  @ApiModelProperty(required = true, value = "Date created")
  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public Project description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description
   * @return description
  **/
  @ApiModelProperty(value = "Description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

   /**
   * Id
   * @return id
  **/
  @ApiModelProperty(value = "Id")
  public Long getId() {
    return id;
  }

  public Project issueTemplateId(String issueTemplateId) {
    this.issueTemplateId = issueTemplateId;
    return this;
  }

   /**
   * Id of the Issue Template used
   * @return issueTemplateId
  **/
  @ApiModelProperty(required = true, value = "Id of the Issue Template used")
  public String getIssueTemplateId() {
    return issueTemplateId;
  }

  public void setIssueTemplateId(String issueTemplateId) {
    this.issueTemplateId = issueTemplateId;
  }

  public Project name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Project project = (Project) o;
    return Objects.equals(this.createdBy, project.createdBy) &&
        Objects.equals(this.creationDate, project.creationDate) &&
        Objects.equals(this.description, project.description) &&
        Objects.equals(this.id, project.id) &&
        Objects.equals(this.issueTemplateId, project.issueTemplateId) &&
        Objects.equals(this.name, project.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, creationDate, description, id, issueTemplateId, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Project {\n");
    
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issueTemplateId: ").append(toIndentedString(issueTemplateId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

