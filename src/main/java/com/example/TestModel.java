package com.example;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Produces;
import io.micronaut.http.hateoas.AbstractResource;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@Produces({MediaType.APPLICATION_HAL_JSON})
@Introspected
public class TestModel extends AbstractResource<TestModel> {

    private String name;
    private int age;
    private String sex;

}
