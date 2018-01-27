
package com.wal.monkeys;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "upcoming_maintenances"
})
public class Result {

    @JsonProperty("upcoming_maintenances")
    private List<UpcomingMaintenance> upcomingMaintenances = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("upcoming_maintenances")
    public List<UpcomingMaintenance> getUpcomingMaintenances() {
        return upcomingMaintenances;
    }

    @JsonProperty("upcoming_maintenances")
    public void setUpcomingMaintenances(List<UpcomingMaintenance> upcomingMaintenances) {
        this.upcomingMaintenances = upcomingMaintenances;
    }

	@Override
	public String toString() {
		return "Result [upcomingMaintenances=" + upcomingMaintenances + ", additionalProperties=" + additionalProperties
				+ "]";
	}

//    @JsonAnyGetter
//    public Map<String, Object> getAdditionalProperties() {
//        return this.additionalProperties;
//    }
//
//    @JsonAnySetter
//    public void setAdditionalProperty(String name, Object value) {
//        this.additionalProperties.put(name, value);
//    }

    
    
}
