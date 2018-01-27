
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
    "reminder_send_at_72hr",
    "reminder_send_at_24hr",
    "reminder_send_at_1hr",
    "datetime_planned_end",
    "datetime_planned_start",
    "statuspage",
    "name",
    "__v",
    "message_subject",
    "reminder_sent_72hr",
    "reminder_sent_24hr",
    "reminder_sent_1hr",
    "reminder_72hr",
    "reminder_24hr",
    "reminder_1hr",
    "datetime_open",
    "historic",
    "automation_stop_text",
    "automation_start_text",
    "automation_completed",
    "automation_started",
    "automation",
    "kind",
    "messages",
    "infrastructure_affected",
    "containers_affected",
    "components_affected"
})
public class UpcomingMaintenance {

    @JsonProperty("_id")
    private String id;
    @JsonProperty("reminder_send_at_72hr")
    private String reminderSendAt72hr;
    @JsonProperty("reminder_send_at_24hr")
    private String reminderSendAt24hr;
    @JsonProperty("reminder_send_at_1hr")
    private String reminderSendAt1hr;
    @JsonProperty("datetime_planned_end")
    private String datetimePlannedEnd;
    @JsonProperty("datetime_planned_start")
    private String datetimePlannedStart;
    @JsonProperty("statuspage")
    private String statuspage;
    @JsonProperty("name")
    private String name;
    @JsonProperty("__v")
    private Integer v;
    @JsonProperty("message_subject")
    private String messageSubject;
    @JsonProperty("reminder_sent_72hr")
    private Boolean reminderSent72hr;
    @JsonProperty("reminder_sent_24hr")
    private Boolean reminderSent24hr;
    @JsonProperty("reminder_sent_1hr")
    private Boolean reminderSent1hr;
    @JsonProperty("reminder_72hr")
    private Boolean reminder72hr;
    @JsonProperty("reminder_24hr")
    private Boolean reminder24hr;
    @JsonProperty("reminder_1hr")
    private Boolean reminder1hr;
    @JsonProperty("datetime_open")
    private String datetimeOpen;
    @JsonProperty("historic")
    private Boolean historic;
    @JsonProperty("automation_stop_text")
    private String automationStopText;
    @JsonProperty("automation_start_text")
    private String automationStartText;
    @JsonProperty("automation_completed")
    private Boolean automationCompleted;
    @JsonProperty("automation_started")
    private Boolean automationStarted;
    @JsonProperty("automation")
    private Boolean automation;
    @JsonProperty("kind")
    private String kind;
    @JsonProperty("messages")
    private List<Message> messages = null;
    @JsonProperty("infrastructure_affected")
    private List<InfrastructureAffected> infrastructureAffected = null;
    @JsonProperty("containers_affected")
    private List<ContainersAffected> containersAffected = null;
    @JsonProperty("components_affected")
    private List<ComponentsAffected> componentsAffected = null;
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

    @JsonProperty("reminder_send_at_72hr")
    public String getReminderSendAt72hr() {
        return reminderSendAt72hr;
    }

    @JsonProperty("reminder_send_at_72hr")
    public void setReminderSendAt72hr(String reminderSendAt72hr) {
        this.reminderSendAt72hr = reminderSendAt72hr;
    }

    @JsonProperty("reminder_send_at_24hr")
    public String getReminderSendAt24hr() {
        return reminderSendAt24hr;
    }

    @JsonProperty("reminder_send_at_24hr")
    public void setReminderSendAt24hr(String reminderSendAt24hr) {
        this.reminderSendAt24hr = reminderSendAt24hr;
    }

    @JsonProperty("reminder_send_at_1hr")
    public String getReminderSendAt1hr() {
        return reminderSendAt1hr;
    }

    @JsonProperty("reminder_send_at_1hr")
    public void setReminderSendAt1hr(String reminderSendAt1hr) {
        this.reminderSendAt1hr = reminderSendAt1hr;
    }

    @JsonProperty("datetime_planned_end")
    public String getDatetimePlannedEnd() {
        return datetimePlannedEnd;
    }

    @JsonProperty("datetime_planned_end")
    public void setDatetimePlannedEnd(String datetimePlannedEnd) {
        this.datetimePlannedEnd = datetimePlannedEnd;
    }

    @JsonProperty("datetime_planned_start")
    public String getDatetimePlannedStart() {
        return datetimePlannedStart;
    }

    @JsonProperty("datetime_planned_start")
    public void setDatetimePlannedStart(String datetimePlannedStart) {
        this.datetimePlannedStart = datetimePlannedStart;
    }

    @JsonProperty("statuspage")
    public String getStatuspage() {
        return statuspage;
    }

    @JsonProperty("statuspage")
    public void setStatuspage(String statuspage) {
        this.statuspage = statuspage;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("__v")
    public Integer getV() {
        return v;
    }

    @JsonProperty("__v")
    public void setV(Integer v) {
        this.v = v;
    }

    @JsonProperty("message_subject")
    public String getMessageSubject() {
        return messageSubject;
    }

    @JsonProperty("message_subject")
    public void setMessageSubject(String messageSubject) {
        this.messageSubject = messageSubject;
    }

    @JsonProperty("reminder_sent_72hr")
    public Boolean getReminderSent72hr() {
        return reminderSent72hr;
    }

    @JsonProperty("reminder_sent_72hr")
    public void setReminderSent72hr(Boolean reminderSent72hr) {
        this.reminderSent72hr = reminderSent72hr;
    }

    @JsonProperty("reminder_sent_24hr")
    public Boolean getReminderSent24hr() {
        return reminderSent24hr;
    }

    @JsonProperty("reminder_sent_24hr")
    public void setReminderSent24hr(Boolean reminderSent24hr) {
        this.reminderSent24hr = reminderSent24hr;
    }

    @JsonProperty("reminder_sent_1hr")
    public Boolean getReminderSent1hr() {
        return reminderSent1hr;
    }

    @JsonProperty("reminder_sent_1hr")
    public void setReminderSent1hr(Boolean reminderSent1hr) {
        this.reminderSent1hr = reminderSent1hr;
    }

    @JsonProperty("reminder_72hr")
    public Boolean getReminder72hr() {
        return reminder72hr;
    }

    @JsonProperty("reminder_72hr")
    public void setReminder72hr(Boolean reminder72hr) {
        this.reminder72hr = reminder72hr;
    }

    @JsonProperty("reminder_24hr")
    public Boolean getReminder24hr() {
        return reminder24hr;
    }

    @JsonProperty("reminder_24hr")
    public void setReminder24hr(Boolean reminder24hr) {
        this.reminder24hr = reminder24hr;
    }

    @JsonProperty("reminder_1hr")
    public Boolean getReminder1hr() {
        return reminder1hr;
    }

    @JsonProperty("reminder_1hr")
    public void setReminder1hr(Boolean reminder1hr) {
        this.reminder1hr = reminder1hr;
    }

    @JsonProperty("datetime_open")
    public String getDatetimeOpen() {
        return datetimeOpen;
    }

    @JsonProperty("datetime_open")
    public void setDatetimeOpen(String datetimeOpen) {
        this.datetimeOpen = datetimeOpen;
    }

    @JsonProperty("historic")
    public Boolean getHistoric() {
        return historic;
    }

    @JsonProperty("historic")
    public void setHistoric(Boolean historic) {
        this.historic = historic;
    }

    @JsonProperty("automation_stop_text")
    public String getAutomationStopText() {
        return automationStopText;
    }

    @JsonProperty("automation_stop_text")
    public void setAutomationStopText(String automationStopText) {
        this.automationStopText = automationStopText;
    }

    @JsonProperty("automation_start_text")
    public String getAutomationStartText() {
        return automationStartText;
    }

    @JsonProperty("automation_start_text")
    public void setAutomationStartText(String automationStartText) {
        this.automationStartText = automationStartText;
    }

    @JsonProperty("automation_completed")
    public Boolean getAutomationCompleted() {
        return automationCompleted;
    }

    @JsonProperty("automation_completed")
    public void setAutomationCompleted(Boolean automationCompleted) {
        this.automationCompleted = automationCompleted;
    }

    @JsonProperty("automation_started")
    public Boolean getAutomationStarted() {
        return automationStarted;
    }

    @JsonProperty("automation_started")
    public void setAutomationStarted(Boolean automationStarted) {
        this.automationStarted = automationStarted;
    }

    @JsonProperty("automation")
    public Boolean getAutomation() {
        return automation;
    }

    @JsonProperty("automation")
    public void setAutomation(Boolean automation) {
        this.automation = automation;
    }

    @JsonProperty("kind")
    public String getKind() {
        return kind;
    }

    @JsonProperty("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    @JsonProperty("messages")
    public List<Message> getMessages() {
        return messages;
    }

    @JsonProperty("messages")
    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    @JsonProperty("infrastructure_affected")
    public List<InfrastructureAffected> getInfrastructureAffected() {
        return infrastructureAffected;
    }

    @JsonProperty("infrastructure_affected")
    public void setInfrastructureAffected(List<InfrastructureAffected> infrastructureAffected) {
        this.infrastructureAffected = infrastructureAffected;
    }

    @JsonProperty("containers_affected")
    public List<ContainersAffected> getContainersAffected() {
        return containersAffected;
    }

    @JsonProperty("containers_affected")
    public void setContainersAffected(List<ContainersAffected> containersAffected) {
        this.containersAffected = containersAffected;
    }

    @JsonProperty("components_affected")
    public List<ComponentsAffected> getComponentsAffected() {
        return componentsAffected;
    }

    @JsonProperty("components_affected")
    public void setComponentsAffected(List<ComponentsAffected> componentsAffected) {
        this.componentsAffected = componentsAffected;
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
		return "UpcomingMaintenance [id=" + id + ", reminderSendAt72hr=" + reminderSendAt72hr + ", reminderSendAt24hr="
				+ reminderSendAt24hr + ", reminderSendAt1hr=" + reminderSendAt1hr + ", datetimePlannedEnd="
				+ datetimePlannedEnd + ", datetimePlannedStart=" + datetimePlannedStart + ", statuspage=" + statuspage
				+ ", name=" + name + ", v=" + v + ", messageSubject=" + messageSubject + ", reminderSent72hr="
				+ reminderSent72hr + ", reminderSent24hr=" + reminderSent24hr + ", reminderSent1hr=" + reminderSent1hr
				+ ", reminder72hr=" + reminder72hr + ", reminder24hr=" + reminder24hr + ", reminder1hr=" + reminder1hr
				+ ", datetimeOpen=" + datetimeOpen + ", historic=" + historic + ", automationStopText="
				+ automationStopText + ", automationStartText=" + automationStartText + ", automationCompleted="
				+ automationCompleted + ", automationStarted=" + automationStarted + ", automation=" + automation
				+ ", kind=" + kind + ", messages=" + messages + ", infrastructureAffected=" + infrastructureAffected
				+ ", containersAffected=" + containersAffected + ", componentsAffected=" + componentsAffected
				+ ", additionalProperties=" + additionalProperties + "]";
	}

    
}
