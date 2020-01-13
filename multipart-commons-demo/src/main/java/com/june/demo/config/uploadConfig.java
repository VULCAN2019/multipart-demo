package com.june.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

/**
 * @author junelee
 * @date 2020/1/12 21:15
 */
//@Configuration
public class uploadConfig {

    @Bean(name="multipartResolver")
    public MultipartResolver multipartResolver() {
        return new CommonsMultipartResolver();
    }
}
