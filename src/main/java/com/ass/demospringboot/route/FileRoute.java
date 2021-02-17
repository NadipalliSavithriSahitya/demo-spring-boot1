package com.ass.demospringboot.route;

import com.ass.demospringboot.processor.MyProcessor;
import org.apache.camel.LoggingLevel;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FileRoute extends RouteBuilder {
    @Value("${app.source}")
    private String sourceloaction;
    @Value("${app.destination}")
    private String destination;

    @Autowired
    private MyProcessor processor;

    @Override
    public void configure() throws Exception {
        from("file:" + sourceloaction)
                .routeId("Demo-File-Route")
                .process(processor)
                .to("file:C:/training/output/")
                .log(LoggingLevel.INFO, "File is moved to destination \n ${body}");

    }

}
