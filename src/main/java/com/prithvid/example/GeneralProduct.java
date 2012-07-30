package com.prithvid.example;

/**
 * Created with IntelliJ IDEA.
 * User: prithvi
 * Date: 7/30/12
 * Time: 1:48 AM
 */

@General
public class GeneralProduct implements Product {

    @Override
    public String partNumber() {
        return "General part number";
    }

    @Override
    public String name() {
        return "General product name";
    }

    @Override
    public String toString() {
        return new StringBuilder().append(name()).append(" : ").append(partNumber()).toString();
    }
}
