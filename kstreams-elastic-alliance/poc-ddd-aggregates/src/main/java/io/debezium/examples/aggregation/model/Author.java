package io.debezium.examples.aggregation.model;

import com.fasterxml.jackson.annotation.*;

import java.util.Date;

public class Author {

    private final EventType _eventType;

    private final Integer author_id;
    private final Integer reference_id;
    private final String first_name;
    private final String last_name;
    private final String name;
    private final String orcid;
    private final Integer order;
    private final String[] affiliations;
    private final boolean corresponding_author;
    private final boolean first_author;
    private final Date date_created;
    private final Date date_updated;


    @JsonCreator
    public Author(
            @JsonProperty("_eventType") EventType _eventType,
            @JsonProperty("author_id") Integer author_id,
            @JsonProperty("reference_id") Integer reference_id,
            @JsonProperty("first_name") String first_name,
            @JsonProperty("last_name") String last_name,
            @JsonProperty("name") String name,
            @JsonProperty("orcid") String orcid,
            @JsonProperty("order") Integer order,
            @JsonProperty("affiliations") String[] affiliations,
            @JsonProperty("corresponding_author") boolean corresponding_author,
            @JsonProperty("first_author") boolean first_author,
            @JsonProperty("date_created") Date date_created,
            @JsonProperty("date_updated") Date date_updated) {
        this._eventType = _eventType == null ? EventType.UPSERT : _eventType;
        this.author_id = author_id;
        this.reference_id = reference_id;
	    this.first_name = first_name;
        this.last_name = last_name;
        this.name = name;
        this.orcid = orcid;
        this.order = order;
        this.affiliations = affiliations;
        this.corresponding_author = corresponding_author;
        this.first_author = first_author;
        this.date_created = date_created;
        this.date_updated = date_updated;
    }

    public EventType get_eventType() {
        return _eventType;
    }

    public Integer getAuthor_id() {
        return author_id;
    }

    public Integer getReference_id() {
        return reference_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getName() {
        return name;
    }

    public String getOrcid() {
        return orcid;
    }

    public Integer getOrder() {
        return order;
    }

    public String[] getAffiliations() {
        return affiliations;
    }

    public boolean getCorresponding_author() {
        return corresponding_author;
    }

    public boolean getFirstAuthor() {
        return first_author;
    }

    public Date getDate_created() {
        return date_created;
    }

    public Date getDate_updated() {
        return date_updated;
    }


    @Override
    public String toString() {
        return "Author{" +
                "_eventType=" + _eventType +
                "author_id=" + author_id +
                ", reference_id=" + reference_id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", name='" + name + '\'' +
                ", orcid='" + orcid + '\'' +
                ", order='" + order + '\'' +
                ", affiliations='" + String.join(",", affiliations) + '\'' +
                ", corresponding_author='" + corresponding_author + '\'' +
                ", first_author='" + first_author + '\'' +
                ", date_created='" + date_created.getTime() + '\'' +
                ", date_updated='" + date_updated.getTime() + '\'' +
                '}';
    }

}
