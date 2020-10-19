package com.a.interceptor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ClassName WebAppConfig
 * @Author qiaoxh
 * @Date 2020/9/5 13:08
 * @Description TOOO
 */
@Configuration
public class WebAppConfig {
    @Bean
    public UserInterceptor userInterceptor(){
        return new UserInterceptor();
    }
    @Bean
    public WebMvcConfigurer webMvcConfigurer() {
        return new InterceptorRegister();
    }
    class InterceptorRegister implements WebMvcConfigurer{
        @Override
        public void addInterceptors(InterceptorRegistry registry) {
            registry.addInterceptor(userInterceptor()).addPathPatterns("/**").
                    excludePathPatterns("/user/login");
        }
    }


}
