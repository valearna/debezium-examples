package io.debezium.examples.aggregation.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class LatestAuthor {

    private DefaultId authorId;

    private DefaultId referenceId;

    private Author latest;

    public LatestAuthor() {}

    @JsonCreator
    public LatestAuthor(
            @JsonProperty("authorId") DefaultId authorId,
            @JsonProperty("referenceId") DefaultId referenceId,
            @JsonProperty("latest") Author latest) {
        this.authorId = authorId;
        this.referenceId = referenceId;
        this.latest = latest;
    }

    public void update(Author author, DefaultId authorId, DefaultId referenceId) {
        if(EventType.DELETE == author.get_eventType()) {
            latest = null;
            return;
        }
        latest = author;
        this.authorId = authorId;
        this.referenceId = referenceId;
    }

    public DefaultId getAuthorId() {
        return authorId;
    }

    public DefaultId getReferenceId() {
        return referenceId;
    }

    public Author getLatest() {
        return latest;
    }

    @Override
    public String toString() {
        return "LatestChild{" +
            "authorId=" + authorId +
            ", referenceId=" + referenceId +
            ", latest=" + latest +
            '}';
    }
}
