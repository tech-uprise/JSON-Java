
package com.wal.monkeys;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "component",
    "container",
    "_id"
})
public class InfrastructureAffected {

    @JsonProperty("component")
    private Component component;
    @JsonProperty("container")
    private Container container;
    @JsonProperty("_id")
    private String id;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("component")
    public Component getComponent() {
        return component;
    }

    @JsonProperty("component")
    public void setComponent(Component component) {
        this.component = component;
    }

    @JsonProperty("container")
    public Container getContainer() {
        return container;
    }

    @JsonProperty("container")
    public void setContainer(Container container) {
        this.container = container;
    }

    @JsonProperty("_id")
    public String getId() {
        return id;
    }

    @JsonProperty("_id")
    public void setId(String id) {
        this.id = id;
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
		return "InfrastructureAffected [component=" + component + ", container=" + container + ", id=" + id
				+ ", additionalProperties=" + additionalProperties + "]";
	}

    
}
