package com.code.configclientdemo.configuration;

import com.code.configclientdemo.service.PersonProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(PersonProperties.class)
@ConditionalOnProperty(prefix = "person",value = "enabled" ,matchIfMissing = true)
public class PersonAutoConfiguration {

}
