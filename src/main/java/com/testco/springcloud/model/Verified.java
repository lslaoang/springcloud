package com.testco.springcloud.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Verified {
    @JsonProperty
    private final int status = 200;
    @JsonProperty
    private final String title = "Access Verified.";
}
