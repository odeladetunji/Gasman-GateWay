package com.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Authentication {

    @JsonProperty("id")
    public Long Id;

    @JsonProperty("email")
    public String email;

    @JsonProperty("password")
    public String password;

}

