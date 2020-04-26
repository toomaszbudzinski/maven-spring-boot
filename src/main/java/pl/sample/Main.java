package pl.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.WebApplicationInitializer;

//compile: mvn clean install -e
//run local tomcat: mvn spring-boot:run
@SpringBootApplication
public class Main {// extends  SpringBootServletInitializer  {

//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//        return builder.sources(Main.class);
//    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }
}