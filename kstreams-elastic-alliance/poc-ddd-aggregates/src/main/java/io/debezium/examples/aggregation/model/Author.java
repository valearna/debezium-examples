package io.debezium.examples.aggregation.model;

import com.fasterxml.jackson.annotation.*;

public class Author {

    private final EventType _eventType;

    private final Integer id;
    private final Integer reference_id;
    private final String first_name;

    @JsonCreator
    public Author(
            @JsonProperty("_eventType") EventType _eventType,
            @JsonProperty("id") Integer id,
            @JsonProperty("reference_id") Integer reference_id,
            @JsonProperty("first_name") String first_name) {
        this._eventType = _eventType == null ? EventType.UPSERT : _eventType;
        this.id = id;
        this.reference_id = reference_id;
	this.first_name = first_name;
    }

    public EventType get_eventType() {
        return _eventType;
    }

    public Integer getId() {
        return id;
    }

    public Integer getReference_id() {
        return reference_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    @Override
    public String toString() {
        return "Author{" +
		"_eventType=" + _eventType +
                "id=" + id +
                ", reference_id=" + reference_id +
                ", first_name='" + first_name + '\'' +
                '}';
    }

}
