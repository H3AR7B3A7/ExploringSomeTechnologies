package be.steven.d.dog.sometechnologies.websockets.controller;

import be.steven.d.dog.sometechnologies.websockets.model.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    @MessageMapping("/chat.send")
    @SendTo("/topic/public")
    public Message sendMessage(@Payload final Message message){
        return message;
    }

    @MessageMapping("/chat.newUser")
    @SendTo("/topic/public")
    public Message newUser(@Payload final Message message, SimpMessageHeaderAccessor headerAccessor){
        headerAccessor.getSessionAttributes().put("username", message.getSender());
        return message;
    }
}
