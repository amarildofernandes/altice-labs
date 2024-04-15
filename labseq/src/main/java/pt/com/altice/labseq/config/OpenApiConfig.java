package pt.com.altice.labseq.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.tags.Tag;
import java.util.Arrays;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

	@Bean
	public OpenAPI openAPI() {
		return new OpenAPI()
				.info(new Info().title("Altice Labs API").version("v1").description("REST API")
						.license(new License().name("Apache 2.0").url("https://springdoc.org")))
				.tags(Arrays.asList(new Tag().name("Labseq").description("Lab Sequence")));
	}
}
