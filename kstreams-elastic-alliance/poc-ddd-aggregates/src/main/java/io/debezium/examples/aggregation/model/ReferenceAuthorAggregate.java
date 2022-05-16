package io.debezium.examples.aggregation.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ReferenceAuthorAggregate {

    private final Reference reference;

    private final List<Author> authors;

    @JsonCreator
    public ReferenceAuthorAggregate(
            @JsonProperty("reference") Reference reference,
            @JsonProperty("authors") List<Author> authors) {
        this.reference = reference;
        this.authors = authors;
    }

    public Reference getReference() {
        return reference;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    @Override
    public String toString() {
        return "ReferenceAuthorsAggregate{" +
                "reference=" + reference +
                ", authors=" + authors +
                '}';
    }

}
