package com.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Payment {

    @JsonProperty("ccv")
    public Long id;

    @JsonProperty("ccv")
    public int ccv;

    @JsonProperty("card_number")
    public Long cardNumber;

    @JsonProperty("pin")
    public int pin;

}
