package org.davshaw.livechat.service.websocket;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Service;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Service
@SuppressWarnings("all")
public class ChatHandler extends TextWebSocketHandler {

    private static final CopyOnWriteArrayList<WebSocketSession> access = new CopyOnWriteArrayList<WebSocketSession>(); 

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        access.add(session);
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        access.remove(session);
    }

    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        for (WebSocketSession socket : access) {
            socket.sendMessage(message);
        }
    }


}
