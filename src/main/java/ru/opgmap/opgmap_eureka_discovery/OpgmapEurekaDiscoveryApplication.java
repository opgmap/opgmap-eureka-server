package ru.opgmap.opgmap_eureka_discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class OpgmapEurekaDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpgmapEurekaDiscoveryApplication.class, args);
	}

}
