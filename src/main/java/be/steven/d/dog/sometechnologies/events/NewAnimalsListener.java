package be.steven.d.dog.sometechnologies.events;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

@Service
public class NewAnimalsListener implements ApplicationListener<NewAnimalEvent> {
    private static final Logger LOGGER = LoggerFactory.getLogger(NewAnimalsListener.class);

    @Override
    public void onApplicationEvent(NewAnimalEvent newAnimalEvent) {
        LOGGER.info("*** There will be a new exhibition soon. ***");
    }
}