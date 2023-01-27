package com.re7eline.enums;

import com.re7eline.messages.EnumNamesBuilder;

public enum RSP {
    ROCK(EnumNamesBuilder.rock()),
    SCISSORS(EnumNamesBuilder.scissors()),
    PAPER(EnumNamesBuilder.paper());
    private String name;

    RSP(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
