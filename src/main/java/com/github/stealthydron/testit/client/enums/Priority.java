package com.github.stealthydron.testit.client.enums;

public enum Priority {

    LOWEST("Lowest");

    private final String value;

    Priority(final String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}
