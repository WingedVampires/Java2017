package com.lsc.lab2.format;

public class FormatText implements Format {

    private String text;

    public FormatText(String text) {
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String format() {
        String regex = "[^\\w&&[^0-9]]";
        text = text.replaceAll("-", "");
        text = text.replaceAll(regex, " ");

        return text.toLowerCase();
    }
}
