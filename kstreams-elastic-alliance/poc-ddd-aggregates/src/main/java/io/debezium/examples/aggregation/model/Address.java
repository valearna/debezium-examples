package io.debezium.examples.aggregation.model;

import com.fasterxml.jackson.annotation.*;

public class Address {

    private final EventType _eventType;

    private final Integer id;
    private final Integer customer_id;
    private final String street;
    private final String city;
    private final String zipcode;
    private final String country;

    @JsonCreator
    public Address(
            @JsonProperty("_eventType") EventType _eventType,
            @JsonProperty("id") Integer id,
            @JsonProperty("customer_id") Integer customer_id,
            @JsonProperty("street") String street,
            @JsonProperty("city") String city,
            @JsonProperty("zipcode") String zipcode,
	    @JsonProperty("country") String country) {
        this._eventType = _eventType == null ? EventType.UPSERT : _eventType;
        this.id = id;
        this.customer_id = customer_id;
        this.street = street;
        this.city = city;
        this.zipcode = zipcode;
	this.country = country;
    }

    public EventType get_eventType() {
        return _eventType;
    }

    public Integer getId() {
        return id;
    }

    public Integer getCustomer_id() {
        return customer_id;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public String getCountry() {
	return country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", customer_id=" + customer_id +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", zipcode='" + zipcode + '\'' +
		", country='" + country + '\'' +
                '}';
    }

}
