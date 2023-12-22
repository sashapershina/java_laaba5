package org.reflexion_lab.implementations;

import org.reflexion_lab.interfaces.SomeInterface;

public class OtherImplementation implements SomeInterface {
    @Override
    public String get() {
        return "B";
    }
}
