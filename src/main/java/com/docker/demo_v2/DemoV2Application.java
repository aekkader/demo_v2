package com.docker.demo_v2;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.client.RestTemplate;

// import java.util.ArrayList;
// import java.util.List;
// import java.util.stream.Collectors;

// import org.springframework.jdbc.core.JdbcTemplate;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoV2Application {



	@RequestMapping("/docker_v2")
	public String home() {
	  return "Hello Docker V2 FROM :: 8082";
	}

	@RequestMapping("/docker_v3")
	public String homeV3() {
	  return "Hello Docker V3 FROM :: 8082";
	}


	public static void main(String[] args) {
		SpringApplication.run(DemoV2Application.class, args);
	}

}
