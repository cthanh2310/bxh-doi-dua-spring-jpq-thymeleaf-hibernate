package com.example.modulebxhdoidua.Response;

public class Response {
    String message;
    Integer status;

    public Response(String message, Integer status) {
        this.message = message;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Response{" +
                "message='" + message + '\'' +
                ", status=" + status +
                '}';
    }
}
