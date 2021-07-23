import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloTest {

    // fn(name) = "Hello Chutipong"
    @Test
    @DisplayName("ทำการทดสอบ.............")
    public void case01() {
        Hello hello = new Hello();
        String name = "Chutipong";
        String actualResult = hello.sawaddee(name);
        assertEquals("Hello Chutipong", actualResult);
    }

}