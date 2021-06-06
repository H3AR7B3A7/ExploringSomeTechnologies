package be.steven.d.dog.sometechnologies.events;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArrivalEvent extends NewAnimalEvent {
    private static final Logger LOGGER = LoggerFactory.getLogger(ArrivalEvent.class);

    public ArrivalEvent(Object source) {
        super(source);
        LOGGER.info("### Prepare the habitat for the new arrival. ###");
    }
}
