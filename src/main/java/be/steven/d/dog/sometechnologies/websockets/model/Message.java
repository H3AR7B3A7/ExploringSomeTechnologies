package be.steven.d.dog.sometechnologies.websockets.model;

public class Message {
    private MessageType messageType;
    private String content;
    private String sender;
    private String time;

    public static class Builder { // Or @Builder with Lombok
        private MessageType messageType = MessageType.CHAT;
        private String content = "";
        private String sender = "";
        private String time = "";

        public Builder() {
        }

        public Builder setMessageType(MessageType messageType) {
            this.messageType = messageType;
            return this;
        }

        public Builder setContent(String content) {
            this.content = content;
            return this;
        }

        public Builder setSender(String sender) {
            this.sender = sender;
            return this;
        }

        public Builder setTime(String time) {
            this.time = time;
            return this;
        }

        public Message build(){
            return new Message(this);
        }
    }

    public Message() {
    }

    public Message(Builder builder) {
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public String getContent() {
        return content;
    }

    public String getSender() {
        return sender;
    }

    public String getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Message{" +
                "messageType=" + messageType +
                ", content='" + content + '\'' +
                ", sender='" + sender + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}