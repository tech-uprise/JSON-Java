
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
    "statuspage",
    "__v",
    "position",
    "containers",
    "name",
    "description"
})
public class ComponentsAffected {

    @JsonProperty("_id")
    private String id;
    @JsonProperty("statuspage")
    private String statuspage;
    @JsonProperty("__v")
    private Integer v;
    @JsonProperty("position")
    private Integer position;
    @JsonProperty("containers")
    private List<String> containers = null;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
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

    @JsonProperty("statuspage")
    public String getStatuspage() {
        return statuspage;
    }

    @JsonProperty("statuspage")
    public void setStatuspage(String statuspage) {
        this.statuspage = statuspage;
    }

    @JsonProperty("__v")
    public Integer getV() {
        return v;
    }

    @JsonProperty("__v")
    public void setV(Integer v) {
        this.v = v;
    }

    @JsonProperty("position")
    public Integer getPosition() {
        return position;
    }

    @JsonProperty("position")
    public void setPosition(Integer position) {
        this.position = position;
    }

    @JsonProperty("containers")
    public List<String> getContainers() {
        return containers;
    }

    @JsonProperty("containers")
    public void setContainers(List<String> containers) {
        this.containers = containers;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

	@Override
	public String toString() {
		return "ComponentsAffected [id=" + id + ", statuspage=" + statuspage + ", v=" + v + ", position=" + position
				+ ", containers=" + containers + ", name=" + name + ", description=" + description
				+ ", additionalProperties=" + additionalProperties + "]";
	}

}
