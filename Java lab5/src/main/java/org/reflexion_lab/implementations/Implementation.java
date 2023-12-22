package org.reflexion_lab.implementations;

import org.reflexion_lab.interfaces.SomeInterface;

public class Implementation implements SomeInterface {
    @Override
    public String get() {
        return "A";
    }
}
