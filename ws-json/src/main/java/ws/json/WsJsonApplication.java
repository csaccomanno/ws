package ws.json;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class WsJsonApplication {

	private static final Logger log = LoggerFactory.getLogger(WsJsonApplication.class);

	public static void main(String[] args) {

		log.info("Corriendo el server JSON");
		SpringApplication.run(WsJsonApplication.class, args);
	}

	/*@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			Result quote = restTemplate.getForObject(WsJsonConstant.URL_sum, Result.class);
			log.info(quote.toString());
		};
	}*/

}
