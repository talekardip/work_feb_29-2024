package com.training.springmvc.config;


import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.sql.DataSource;
import java.sql.DriverManager;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.training.springmvc")
@PropertySource("classpath:database.properties")//for database
public class AppConfig {

    @Autowired
    Environment environment;

    @Bean
    public InternalResourceViewResolver resolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();

        //place where our views are stored
        resolver.setPrefix("/WEB-INF/pages/");

        //just the extension
        resolver.setSuffix(".jsp");
        return resolver;
    }

    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource driverManagerDataSource =
                new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName(environment.getProperty("driver"));
        driverManagerDataSource.setUrl(environment.getProperty("url"));
        driverManagerDataSource.setUsername(environment.getProperty("dbuser"));
        driverManagerDataSource.setPassword(environment.getProperty("dbpassword"));
        return driverManagerDataSource;
    }

}