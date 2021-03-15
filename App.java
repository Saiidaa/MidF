package Conf;

import entity.UserD;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

public class App {
    @Configuration
    @EnableWebMvc
    public class App {

        @Override

        public void addResourceHandlers(ResourceHandlerRegistry registry) {
            registry.addResourceHandler("/pages/**").addResourceLocations("/pages/");
        }

        @Bean
        public UrlBasedViewResolver setupViewResolver() {
            UrlBasedViewResolver resolver = new UrlBasedViewResolver();
            resolver.setPrefix("/pages/");
            resolver.setSuffix(".jsp");
            resolver.setViewClass(JstlView.class);


            return resolver;
        }
        @Bean
        public UserD getUserD(){
            return new UserD();
        }

    }

}
