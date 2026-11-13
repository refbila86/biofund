package mz.co.biodiversity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class BiodiversityApplication extends SpringBootServletInitializer
{
	public static void main(String[] args)
	{
		SpringApplication.run(BiodiversityApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application)
	{
		return application.sources(BiodiversityApplication.class);
	}
}
