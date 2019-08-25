package org.learn.java.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration 
@EnableWebMvc
@ComponentScan("org.learn.java.*")
public class ApplicationConfig {
	


}
