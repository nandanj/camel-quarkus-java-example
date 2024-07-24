package org.example.project.foo;

import org.apache.camel.builder.RouteBuilder;

public class foo extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("timer:java?period=1000")
            .setBody()
                .simple("Hello Camel from ${routeId}")
            .log("${body}");
    }
}
