package my.springmvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by xc on 2017/11/1.
 */
@Configuration
@ComponentScan(basePackages = "my.springmvc.config",
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION,value = EnableWebMvc.class))
public class RootConfig {
}
