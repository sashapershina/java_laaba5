package org.reflexion_lab;

import org.reflexion_lab.interfaces.SomeAnotherInterface;
import org.reflexion_lab.interfaces.SomeInterface;
import org.reflexion_lab.interfaces.SomeOtherInterface;

public class Container {
    @AutoInjectable
    private SomeInterface someInterface;
    @AutoInjectable
    private SomeOtherInterface someOtherInterface;
    @AutoInjectable
    private SomeAnotherInterface someAnotherInterface;

    public String getInterface() {
        return someInterface.get();
    }
    public String getOtherInterface() {
        return someOtherInterface.get();
    }
    public String getAnotherInterface() {
        return someAnotherInterface.get();
    }
}
