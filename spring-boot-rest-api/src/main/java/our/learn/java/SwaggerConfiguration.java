package our.learn.java;

import java.util.Collection;
import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration 
{
	@Bean
	public Docket api(){
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("our.learn.java"))
				.paths(PathSelectors.regex("/api/rest.*"))
				.build()
				.apiInfo(apiInfo());			
		
	}
	
	private ApiInfo apiInfo()
	{
		return new ApiInfo("OUR REST APIs",
				"This REST API is very good", 
				"Version-1.0",
				"https://static.shopspring.com/resources/terms_of_service.html",
				new Contact("John Doe" ,"www.bbc.com", "best@gmail.com"),
				"GNU Public V2.0",
				"https://www.gnu.org/licenses/gpl-3.0.en.html",
				 Collections.emptyList());
	}

}
