package com.ccqtgb.sxp.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.WebApplicationInitializer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer extends SpringBootServletInitializer implements WebApplicationInitializer
{
    public static void main( String[] args )
    {
         SpringApplication.run(EurekaServer.class, args);
    }
    
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(EurekaServer.class);
	}

}
