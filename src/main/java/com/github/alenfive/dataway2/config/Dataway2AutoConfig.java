package com.github.alenfive.dataway2.config;

import com.github.alenfive.dataway2.controller.ApiController;
import com.github.alenfive.dataway2.controller.ViewController;
import com.github.alenfive.dataway2.extend.ApiPager;
import com.github.alenfive.dataway2.extend.DataSourceDialect;
import com.github.alenfive.dataway2.extend.MysqlDataSource;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableConfigurationProperties({Dataway2Properties.class})
public class Dataway2AutoConfig {

    @Bean
    @ConditionalOnMissingBean
    public ApiController getApiController(){
        return new ApiController();
    }

    @Bean
    @ConditionalOnMissingBean
    public ViewController getViewController(){
        return new ViewController();
    }

    @Bean
    @ConditionalOnMissingBean
    public SQLRequestMappingFactory getSQLRequestMappingConfig(){
        return new SQLRequestMappingFactory();
    }

    @Bean
    @ConditionalOnMissingBean
    public DataSourceDialect getDataSourceDialect(){
        return new MysqlDataSource();
    }

    @Bean
    @ConditionalOnMissingBean
    public ApiPager getApiPager(){
        return new ApiPager();
    }
}