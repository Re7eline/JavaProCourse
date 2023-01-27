package com.re7eline.locale;

import com.re7eline.messages.MessageBuilder;

import java.util.Locale;

public abstract class LocaleChange {
    public static Locale defLocale = Locale.getDefault();

    public static Locale changeLocale(String language, String country) {
        MessageBuilder.setLanguage();
        return defLocale = new Locale(language,country);
    }
}
