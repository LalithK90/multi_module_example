package io.losith.multi_module_example.application;


import io.losith.multi_module_example.service.MultiModuleExampleLibraryService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "io.losith.multi_module_example")
@RestController
public class MultiModuleExampleApplication {
	private final MultiModuleExampleLibraryService myService;

	public MultiModuleExampleApplication(MultiModuleExampleLibraryService myService) {
		this.myService = myService;
	}

	@GetMapping("/test")
	public String home() {
		System.out.println(" app module");
		return myService.message();
	}

	public static void main(String[] args) {
		SpringApplication.run(MultiModuleExampleApplication.class, args);
	}

}
/*
dependencies {
        implementation 'org.springframework.boot:spring-boot-starter-thymeleaf'
        implementation 'org.springframework.boot:spring-boot-starter-web'
        compileOnly 'org.projectlombok:lombok'
        developmentOnly 'org.springframework.boot:spring-boot-devtools'
        annotationProcessor 'org.springframework.boot:spring-boot-configuration-processor'
        annotationProcessor 'org.projectlombok:lombok'
        testImplementation('org.springframework.boot:spring-boot-starter-test') {
            exclude group: 'org.junit.vintage', module: 'junit-vintage-engine'
        }
    }
* */