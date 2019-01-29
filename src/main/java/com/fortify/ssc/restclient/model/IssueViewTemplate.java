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
import com.fortify.ssc.restclient.model.TemplateItem;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Issue view template DTO object.
 */
@ApiModel(description = "Issue view template DTO object.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-09T13:54:27.094-07:00")
public class IssueViewTemplate {
  @SerializedName("dataVersion")
  private Long dataVersion = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("engineType")
  private String engineType = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("metadataId")
  private Long metadataId = null;

  @SerializedName("objectVersion")
  private Integer objectVersion = null;

  @SerializedName("templateData")
  private List<List<TemplateItem>> templateData = null;

  public IssueViewTemplate dataVersion(Long dataVersion) {
    this.dataVersion = dataVersion;
    return this;
  }

   /**
   * Issue data version for which template is created.
   * @return dataVersion
  **/
  @ApiModelProperty(value = "Issue data version for which template is created.")
  public Long getDataVersion() {
    return dataVersion;
  }

  public void setDataVersion(Long dataVersion) {
    this.dataVersion = dataVersion;
  }

  public IssueViewTemplate description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Template description.
   * @return description
  **/
  @ApiModelProperty(value = "Template description.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public IssueViewTemplate engineType(String engineType) {
    this.engineType = engineType;
    return this;
  }

   /**
   * Engine type for which template is created.
   * @return engineType
  **/
  @ApiModelProperty(value = "Engine type for which template is created.")
  public String getEngineType() {
    return engineType;
  }

  public void setEngineType(String engineType) {
    this.engineType = engineType;
  }

   /**
   * Unique identifier of the issue view template.
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier of the issue view template.")
  public Long getId() {
    return id;
  }

  public IssueViewTemplate metadataId(Long metadataId) {
    this.metadataId = metadataId;
    return this;
  }

   /**
   * Id of the plugin meta data for which template is created.
   * @return metadataId
  **/
  @ApiModelProperty(value = "Id of the plugin meta data for which template is created.")
  public Long getMetadataId() {
    return metadataId;
  }

  public void setMetadataId(Long metadataId) {
    this.metadataId = metadataId;
  }

  public IssueViewTemplate objectVersion(Integer objectVersion) {
    this.objectVersion = objectVersion;
    return this;
  }

   /**
   * Object version.
   * @return objectVersion
  **/
  @ApiModelProperty(required = true, value = "Object version.")
  public Integer getObjectVersion() {
    return objectVersion;
  }

  public void setObjectVersion(Integer objectVersion) {
    this.objectVersion = objectVersion;
  }

  public IssueViewTemplate templateData(List<List<TemplateItem>> templateData) {
    this.templateData = templateData;
    return this;
  }

  public IssueViewTemplate addTemplateDataItem(List<TemplateItem> templateDataItem) {
    if (this.templateData == null) {
      this.templateData = new ArrayList<List<TemplateItem>>();
    }
    this.templateData.add(templateDataItem);
    return this;
  }

   /**
   * Actual template JSON data.
   * @return templateData
  **/
  @ApiModelProperty(value = "Actual template JSON data.")
  public List<List<TemplateItem>> getTemplateData() {
    return templateData;
  }

  public void setTemplateData(List<List<TemplateItem>> templateData) {
    this.templateData = templateData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueViewTemplate issueViewTemplate = (IssueViewTemplate) o;
    return Objects.equals(this.dataVersion, issueViewTemplate.dataVersion) &&
        Objects.equals(this.description, issueViewTemplate.description) &&
        Objects.equals(this.engineType, issueViewTemplate.engineType) &&
        Objects.equals(this.id, issueViewTemplate.id) &&
        Objects.equals(this.metadataId, issueViewTemplate.metadataId) &&
        Objects.equals(this.objectVersion, issueViewTemplate.objectVersion) &&
        Objects.equals(this.templateData, issueViewTemplate.templateData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataVersion, description, engineType, id, metadataId, objectVersion, templateData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueViewTemplate {\n");
    
    sb.append("    dataVersion: ").append(toIndentedString(dataVersion)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    engineType: ").append(toIndentedString(engineType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    metadataId: ").append(toIndentedString(metadataId)).append("\n");
    sb.append("    objectVersion: ").append(toIndentedString(objectVersion)).append("\n");
    sb.append("    templateData: ").append(toIndentedString(templateData)).append("\n");
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
