package org.raado.configs;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotEmpty;

@Getter
public class MongoConfig {

    @JsonProperty
    @NotEmpty
    private String mongohost;

    @JsonProperty
    private final int mongoport = 27017;

    @JsonProperty
    @NotEmpty
    @Builder.Default
    private final String mongodbName = "raado";
}
