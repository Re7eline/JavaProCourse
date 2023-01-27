package com.re7eline.players;

import com.re7eline.messages.MessageBuilder;

public class Computer {
    private String hand;

    public Computer() {}

    public String getHand() {
        return hand;
    }

    public void setHand(String hand) {
        this.hand = hand;
    }

    @Override
    public String toString() {
        return MessageBuilder.computerChooseMsg(hand);
    }
}
