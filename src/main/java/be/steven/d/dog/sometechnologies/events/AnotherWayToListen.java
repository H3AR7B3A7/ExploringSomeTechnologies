package be.steven.d.dog.sometechnologies.events;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class AnotherWayToListen {
    private static final Logger LOGGER = LoggerFactory.getLogger(AnotherWayToListen.class);

    @EventListener
    public void onNewAnimalEvent(NewAnimalEvent event) {
        LOGGER.warn("### AnotherWayToListen just received the event too... ###");
    }
}