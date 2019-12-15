package com.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Distributors {

    @JsonProperty("Id")
    public Long Id;

    @JsonProperty("fullname")
    public String fullname;

    @JsonProperty("photographID")
    public String photographId;

    @JsonProperty("phoneNumber")
    public Long phoneNumber;

    @JsonProperty("meansOfdelivery")
    public String meansOfDelivery;

    @JsonProperty("shopAddress")
    public String shopAddress;

    @JsonProperty("locationOnmap")
    public String LocationOnMap;

}
