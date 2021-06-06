package be.steven.d.dog.sometechnologies.events;

import org.springframework.context.ApplicationEvent;

public class NewAnimalEvent extends ApplicationEvent {

    public NewAnimalEvent(Object source) {
        super(source);
    }
}
