package configuration;

import mathOperation.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {


    @Bean
    Addition getAddition(){
        return new Addition();
    }

    @Bean
    Division getDivision(){
        return new Division();
    }

    @Bean
    Multiplication getMultiplication(){
        return new Multiplication();
    }

    @Bean
    Subtraction getSubtraction(){
        return new Subtraction();
    }

}
