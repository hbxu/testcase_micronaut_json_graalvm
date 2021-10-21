package com.example;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.MutableHttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.hateoas.Link;

@Controller("/hello")
public class HelloController {

    @Get("/")
    public HttpResponse<TestModel> get() {
        final TestModel test = TestModel.builder().name("james").build();
        test.link(Link.SELF, Link.build("http://test.com").title("title").build());
        return HttpResponse.status(HttpStatus.OK).body(test);
    }

}
