package com.example.demo.config;

import org.springframework.jdbc.core.*;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public JdbcTemplate jdbcTemplate(HikariDataSource hikariDataSource){
		return new JdbcTemplate(hikariDataSource);
	}
}
