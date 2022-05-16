package io.debezium.examples.aggregation.model;

import com.fasterxml.jackson.annotation.*;

public class Reference {

    private final EventType _eventType;

    private final Integer id;
    private final String curie;
    private final String title;

    @JsonCreator
    public Reference(
            @JsonProperty("_eventType") EventType _eventType,
            @JsonProperty("id") Integer id,
            @JsonProperty("curie") String curie,
            @JsonProperty("title") String title) {
        this._eventType = _eventType == null ? EventType.UPSERT : _eventType;
        this.id = id;
        this.curie = curie;
        this.title = title;
    }

    public EventType get_eventType() {
        return _eventType;
    }

    public Integer getId() {
        return id;
    }

    public String getCurie() {
        return curie;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Reference{" +
                "_eventType='" + _eventType + '\'' +
                ", id=" + id +
                ", curie='" + curie + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

}
