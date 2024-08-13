package poc.cbam.testdata.generator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import poc.cbam.testdata.generator.simple.service.SimpleGeneratorService;


@SpringBootApplication
public class TestDataGeneratorApplication {

private static Logger LOG = LoggerFactory.getLogger(TestDataGeneratorApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TestDataGeneratorApplication.class, args);
	}


}
