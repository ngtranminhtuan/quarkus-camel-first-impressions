package techlab;

import org.apache.camel.builder.RouteBuilder;

public class CamelRouteBuilder extends RouteBuilder {

    public void configure() {
        from("timer://testTimer").log("test");
    }
}