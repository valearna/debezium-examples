package io.debezium.examples.aggregation.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Authors {

    @JsonProperty
    @JsonSerialize(keyUsing = DefaultId.IdSerializer.class)
    @JsonDeserialize(keyUsing = DefaultId.IdDeserializer.class)
    private Map<DefaultId,Author> entries = new LinkedHashMap<>();

    public void update(LatestAuthor author) {
        if(author.getLatest() != null) {
            entries.put(author.getAuthorId(),author.getLatest());
        } else {
            entries.remove(author.getAuthorId());
        }
    }

    @JsonIgnore
    public List<Author> getEntries() {
        return new ArrayList<>(entries.values());
    }

    @Override
    public String toString() {
        return "Authors{" +
            "entries=" + entries +
            '}';
    }
}
