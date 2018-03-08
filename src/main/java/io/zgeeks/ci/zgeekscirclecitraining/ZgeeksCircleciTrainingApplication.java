package io.zgeeks.ci.zgeekscirclecitraining;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "io.zgeeks.ci.zgeekscirclecitraining.config", "io.zgeeks.ci.zgeekscirclecitraining.rest" })
public class ZgeeksCircleciTrainingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZgeeksCircleciTrainingApplication.class, args);
	}
}
