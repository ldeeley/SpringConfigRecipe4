package com.example.springconfigrecipe4.config;

import com.example.springconfigrecipe4.model.DatePrefixGenerator;
import com.example.springconfigrecipe4.model.SequenceGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SequenceGeneratorConfig {


    @Bean
    public DatePrefixGenerator datePrefixGenerator(){
        DatePrefixGenerator dpg = new DatePrefixGenerator();
        dpg.setPattern("yyyyMMdd");
        return dpg;
    }

    @Bean
    public SequenceGenerator sequenceGenerator(){
        SequenceGenerator sequence = new SequenceGenerator();
        sequence.setIntial(10000);
        sequence.setSuffix("A");
        sequence.setPrefix(datePrefixGenerator().toString());
        return sequence;
    }


}
