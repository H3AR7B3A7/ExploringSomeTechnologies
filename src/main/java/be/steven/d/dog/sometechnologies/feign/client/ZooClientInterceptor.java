package be.steven.d.dog.sometechnologies.feign.client;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ZooClientInterceptor implements RequestInterceptor {

    private final Logger LOGGER = LoggerFactory.getLogger(ZooClientInterceptor.class);

    @Override
    public void apply(RequestTemplate requestTemplate) {
        requestTemplate.header("myHeaderKey", "myVar1");
        LOGGER.warn("### CUSTOM INTERCEPTOR WAS USED ###");
    }
}
