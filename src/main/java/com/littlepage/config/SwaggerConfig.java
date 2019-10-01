package com.littlepage.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	/**
	 * 配置swagger bean实例
	 * @return
	 */
	@Bean
	public Docket docket() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).
				select().apis(RequestHandlerSelectors.basePackage("com.littlepage")).build();
	}
	
	/**
	 * 配置swagger信息
	 * @return
	 */
	private ApiInfo apiInfo() {
		return new ApiInfo("steve yu's API document", 
				"for quick start swagger", "1.0", 
				"https://www.cnblogs.com/littlepage/", 
				new Contact("steve yu", "https://www.cnblogs.com/littlepage/", "littlepageprogram@outlook.com"),
				"Apache 2.0","http://www.apache.org/licenses/LICENSE-2.0",new ArrayList<>());
	}
}
