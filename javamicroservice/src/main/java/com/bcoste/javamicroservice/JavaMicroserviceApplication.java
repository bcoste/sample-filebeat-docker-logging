package com.bcoste.javamicroservice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JavaMicroserviceApplication {

    private static final Logger log = LoggerFactory.getLogger(JavaMicroserviceApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(JavaMicroserviceApplication.class, args);
	}
    
    @GetMapping("/")
	public String crash() {
		log.info("Crash method is starting...");
		log.error("No luck !", new RuntimeException("Crash made a runtime exception"));
		return "Crash method returned string";
	}
}
