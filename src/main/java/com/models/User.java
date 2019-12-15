package com.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class User {


    @JsonProperty("id")
    public Long Id;

    @JsonProperty("fullname")
    public String fullname;


}
