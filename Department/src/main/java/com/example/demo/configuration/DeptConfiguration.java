package com.example.demo.configuration;
import javax.sql.DataSource;

import org.h2.server.web.WebServlet;
import org.modelmapper.ModelMapper;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.util.DeptUtility;

@Configuration
public class DeptConfiguration {

	@Bean
	public ModelMapper modelMapper() {
	    return new ModelMapper();
	}
	
	/*@Bean
	ServletRegistrationBean h2servletRegistration(){
		   ServletRegistrationBean registrationBean = new ServletRegistrationBean( new WebServlet());
		   registrationBean.addUrlMappings("/console/*");
		    return registrationBean;
		    }*/
	@Bean
	public DeptUtility deptUtility(){
		return new DeptUtility();
	}
	
	@Bean
    @ConfigurationProperties(prefix = "spring.datasource")
	public DataSource empDS() {
	//return DataSourceBuilder.create().build();
		return DataSourceBuilder.create().build();
    }

}
