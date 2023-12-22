import org.junit.Assert;
import org.junit.Test;
import org.reflexion_lab.Injector;
import org.reflexion_lab.Container;

import java.io.IOException;

public class InjectorTest {
    Injector injector;

    @Test
    public void inject() throws IOException {
        injector = new Injector();
        injector.connectToProperties("pr.properties");

        Container container = (Container) injector.inject(new Container());

        Assert.assertEquals(container.getInterface(), "A");
        Assert.assertEquals(container.getOtherInterface(), "C");
        Assert.assertEquals(container.getAnotherInterface(), "E");
    }
}