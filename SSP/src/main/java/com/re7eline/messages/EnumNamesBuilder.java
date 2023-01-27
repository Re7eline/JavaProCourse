package com.re7eline.messages;

import static com.re7eline.messages.MessageBuilder.resourceBundle;

public abstract class EnumNamesBuilder {

    public static String rock() {
        return resourceBundle.getString("rock");
    }

    public static String scissors() {
        return resourceBundle.getString("scissors");
    }

    public static String paper() {
        return resourceBundle.getString("paper");
    }

    public static String gameResultMsg() {
        return resourceBundle.getString("gameResult");
    }

    public static String playerWinsMsg() {
        return resourceBundle.getString("playerWins");
    }

    public static String computerWinsMsg() {
        return resourceBundle.getString("computerWins");
    }

    public static String drawMsg() {
        return resourceBundle.getString("draw");
    }
}
