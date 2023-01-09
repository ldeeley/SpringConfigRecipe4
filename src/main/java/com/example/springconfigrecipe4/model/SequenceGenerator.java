package com.example.springconfigrecipe4.model;

public class SequenceGenerator {

    private int intial;
    private String prefix;
    private String suffix;

    public int getIntial() {
        return intial;
    }

    public void setIntial(int intial) {
        this.intial = intial;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
