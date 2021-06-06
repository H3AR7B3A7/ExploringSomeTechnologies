package be.steven.d.dog.sometechnologies.events;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BirthEvent extends NewAnimalEvent {
    private static final Logger LOGGER = LoggerFactory.getLogger(BirthEvent.class);

    public BirthEvent(Object source) {
        super(source);
        LOGGER.info("### Prepare the nursery for the new born baby. ###");
    }
}