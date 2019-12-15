package com.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Orders {

    @JsonProperty("orderOption")
    public String orderOption;

    @JsonProperty("gasSize")
    public double gasSize;

    @JsonProperty("quantity")
    public int quantity;

    @JsonProperty("amount")
    public int amount;

    @JsonProperty("deliveryAddress")
    public String deliveryAddress;

}
