package springboot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import springboot.Interceptor.CustomerInterceptor;

/**
 * @author 雒建荣
 * commitDate 2019/8/22 23:07
 */
@Configuration
public class SystemConfig extends WebMvcConfigurationSupport {
    @Autowired
    private CustomerInterceptor customerInterceptor;
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(customerInterceptor)
               .addPathPatterns("/**")
                .excludePathPatterns("/test","/time","find");
    }
}
