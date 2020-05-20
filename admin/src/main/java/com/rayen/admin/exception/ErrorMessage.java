package com.rayen.admin.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class ErrorMessage {

    public ErrorMessage(boolean handledException) {
        this.error = handledException
                ? new Message(1, "General server error", "Please refer to server logs for more details")
                : new Message(0, "Unhandled Exception", "Please refer to server logs for more details");
    }

    public ErrorMessage(int code, String type, String message) {
        this.error = new Message(code, type, message);
    }

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    class Message {
        private int code;
        private String type;
        private String message;
    }

    private Message error;
}