package com.qf.j1906.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.annotations.ApiIgnore;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author: 刘旭
 * Date: 2019/12/7 13:58
 * @Version 1.0
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket petApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.qf.j1906"))
                .build()
                .ignoredParameterTypes(ApiIgnore.class);
    }
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("金融项目 api 说明")
                .contact(new Contact("刘旭","null","157153926@qq.com.com"))
                .version("0.1")
                .termsOfServiceUrl("localhost:8080/getProductById/")
                .description("金融项目swagge")
                .build();
    }
}
