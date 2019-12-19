package com.demo.taiji;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.demo.taiji")
public class TaijiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaijiApplication.class, args);
	}

}
