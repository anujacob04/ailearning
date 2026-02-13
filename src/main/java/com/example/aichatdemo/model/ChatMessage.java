package com.example.aichatdemo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ChatMessage {

    private String id;
    private String sender;
    private String content;
    private MessageType type;
    private String timestamp;

    public enum MessageType {
        CHAT,
        JOIN,
        LEAVE
    }
}
