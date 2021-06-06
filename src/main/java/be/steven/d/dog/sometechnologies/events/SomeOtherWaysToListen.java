package be.steven.d.dog.sometechnologies.events;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class SomeOtherWaysToListen {
    private static final Logger LOGGER = LoggerFactory.getLogger(SomeOtherWaysToListen.class);

    @EventListener(classes = {NewAnimalEvent.class})
    public void onNewAnimalEvent() {
        LOGGER.warn("### AnotherWayToListen 1 just received the event too... ###");
    }

    @EventListener()
    public void onNewAnimalEvent2(NewAnimalEvent event) {
        LOGGER.warn("### AnotherWayToListen 2 just received the event too... ###");
    }

    @EventListener(classes = {ApplicationEvent.class}) // This will react to ALL Spring events
    public void onNewAnimalEvent2() {
        LOGGER.warn("### AnotherWayToListen 3 just received the event too... ###");
    }
}