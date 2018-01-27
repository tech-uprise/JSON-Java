
package com.wal.monkeys;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "_id",
    "user_email",
    "user_id",
    "user_full_name",
    "details",
    "state",
    "status",
    "statuspage",
    "maintenance",
    "ip",
    "__v",
    "datetime",
    "historic",
    "containers",
    "components"
})
public class Message {

    @JsonProperty("_id")
    private String id;
    @JsonProperty("user_email")
    private String userEmail;
    @JsonProperty("user_id")
    private String userId;
    @JsonProperty("user_full_name")
    private String userFullName;
    @JsonProperty("details")
    private String details;
    @JsonProperty("state")
    private Integer state;
    @JsonProperty("status")
    private Integer status;
    @JsonProperty("statuspage")
    private String statuspage;
    @JsonProperty("maintenance")
    private String maintenance;
    @JsonProperty("ip")
    private String ip;
    @JsonProperty("__v")
    private Integer v;
    @JsonProperty("datetime")
    private String datetime;
    @JsonProperty("historic")
    private Boolean historic;
    @JsonProperty("containers")
    private List<String> containers = null;
    @JsonProperty("components")
    private List<String> components = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("_id")
    public String getId() {
        return id;
    }

    @JsonProperty("_id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("user_email")
    public String getUserEmail() {
        return userEmail;
    }

    @JsonProperty("user_email")
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @JsonProperty("user_id")
    public String getUserId() {
        return userId;
    }

    @JsonProperty("user_id")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    @JsonProperty("user_full_name")
    public String getUserFullName() {
        return userFullName;
    }

    @JsonProperty("user_full_name")
    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }

    @JsonProperty("details")
    public String getDetails() {
        return details;
    }

    @JsonProperty("details")
    public void setDetails(String details) {
        this.details = details;
    }

    @JsonProperty("state")
    public Integer getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(Integer state) {
        this.state = state;
    }

    @JsonProperty("status")
    public Integer getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Integer status) {
        this.status = status;
    }

    @JsonProperty("statuspage")
    public String getStatuspage() {
        return statuspage;
    }

    @JsonProperty("statuspage")
    public void setStatuspage(String statuspage) {
        this.statuspage = statuspage;
    }

    @JsonProperty("maintenance")
    public String getMaintenance() {
        return maintenance;
    }

    @JsonProperty("maintenance")
    public void setMaintenance(String maintenance) {
        this.maintenance = maintenance;
    }

    @JsonProperty("ip")
    public String getIp() {
        return ip;
    }

    @JsonProperty("ip")
    public void setIp(String ip) {
        this.ip = ip;
    }

    @JsonProperty("__v")
    public Integer getV() {
        return v;
    }

    @JsonProperty("__v")
    public void setV(Integer v) {
        this.v = v;
    }

    @JsonProperty("datetime")
    public String getDatetime() {
        return datetime;
    }

    @JsonProperty("datetime")
    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    @JsonProperty("historic")
    public Boolean getHistoric() {
        return historic;
    }

    @JsonProperty("historic")
    public void setHistoric(Boolean historic) {
        this.historic = historic;
    }

    @JsonProperty("containers")
    public List<String> getContainers() {
        return containers;
    }

    @JsonProperty("containers")
    public void setContainers(List<String> containers) {
        this.containers = containers;
    }

    @JsonProperty("components")
    public List<String> getComponents() {
        return components;
    }

    @JsonProperty("components")
    public void setComponents(List<String> components) {
        this.components = components;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
