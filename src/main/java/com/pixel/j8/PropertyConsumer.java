package com.pixel.j8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.function.Supplier;

//@Component
public class PropertyConsumer {

    private final Supplier<String> getProperty;

    @Autowired
    public PropertyConsumer(Supplier<String> getPropertySupplier) {
        this.getProperty = getPropertySupplier;
    }

    public void printPropertyValue() {
        String value = getProperty.get();
        System.out.println("Value of property: " + value);
    }
}
