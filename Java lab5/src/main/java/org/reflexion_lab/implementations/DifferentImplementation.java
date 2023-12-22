package org.reflexion_lab.implementations;

import org.reflexion_lab.interfaces.SomeAnotherInterface;

public class DifferentImplementation implements SomeAnotherInterface {
    @Override
    public String get() {
        return "E";
    }
}
