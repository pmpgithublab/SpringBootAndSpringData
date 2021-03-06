package ua.training.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;


@SpringBootApplication
public class WebApp implements WebMvcConfigurer{

    public static void main(String[] args) {
        SpringApplication.run(WebApp.class, args);
    }

    @Bean
    public LocaleResolver localeResolver () {
        SessionLocaleResolver localeResolver = new SessionLocaleResolver();
        localeResolver.setDefaultLocale(LocaleContextHolder.getLocale());
        return localeResolver;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry){
        LocaleChangeInterceptor localeChangeInterceptor = new LocaleChangeInterceptor();
        localeChangeInterceptor.setParamName("localeCode");
        registry.addInterceptor(localeChangeInterceptor);
    }

}
