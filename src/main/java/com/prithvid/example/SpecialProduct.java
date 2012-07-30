package com.prithvid.example;

/**
 * Created with IntelliJ IDEA.
 * User: prithvi
 * Date: 7/30/12
 * Time: 1:48 AM
 */

@Special
public class SpecialProduct implements Product {

    @Override
    public String name() {
        return "Special product name";
    }

    @Override
    public String partNumber() {
        return "Special part number";
    }

    @Override
    public String toString() {
        return new StringBuilder().append(name()).append(" : ").append(partNumber()).toString();
    }

}
