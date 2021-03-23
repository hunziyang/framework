package com.wdy.framework.config;

import lombok.Data;

@Data
public class FastJsonWraper<T> {
    private T value;

    public FastJsonWraper() {
    }

    public FastJsonWraper(T value) {
        this.value = value;
    }
}
