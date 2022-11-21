package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;

import java.util.Arrays;

@SpringBootApplication
public class SpringProfilesApplication implements CommandLineRunner {

	@Autowired
	private Environment env;

	public static void main(String[] args) {
		SpringApplication.run(SpringProfilesApplication.class, args);
		//System.out.println(env);

	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(Arrays.toString(env.getActiveProfiles()));
	}
}
