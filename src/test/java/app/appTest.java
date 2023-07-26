package app;

import com.google.j2cl.junit.apt.J2clTestInput;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

@J2clTestInput(appTest.class)
public class appTest {

    @Test
    public void someSimpleTest() {
        assertEquals(app.HELLO_WORLD, new app().helloWorldString());
    }
}
