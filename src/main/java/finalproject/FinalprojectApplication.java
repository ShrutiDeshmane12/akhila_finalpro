package finalproject;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FinalprojectApplication {
	@GetMapping()
	public String getmessage()

	{
		return "welcome ";
	}
	
	public String getmessage1()

	{
		return "welcome ";
	}
	public static void main(String[] args) {
		SpringApplication.run(FinalprojectApplication.class, args);
	}

}
