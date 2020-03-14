package com.javastudio.tutorial.api.dto;

public class Response<T> {
    final T t;

    public Response(T t) {
        this.t = t;
    }
}
