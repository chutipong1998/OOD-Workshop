package dip;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RandomX extends Random {
    long number;
    public RandomX(long seed) {
        number = seed;
    }

    @Override
    public int nextInt(int bound) {
        return (int) number;
    }
}

class SpyRandom extends Random {
    private boolean called = false;
    private int counter = 0;
    @Override
    public int nextInt(int bound) {
        this.called = true;
        return 100;
    }

    public void verify(int count) {
        assertEquals(count, this.counter);
    }

    public boolean isCall() {
        return called;
    }
}

public class GenerateIdServiceTest {

    @Test
    public void call_nextInt_of_Random() {
        GenerateIdService service = new GenerateIdService();
        SpyRandom spy = new SpyRandom();
        service.setRandom(spy);
        service.getId();
        assertTrue(spy.isCall());
        spy.verify(2);
    }
    @Test
    @DisplayName("ต้องได้ id=XYZ7")
    public void case01() {
        GenerateIdService service = new GenerateIdService();
        service.setRandom(new RandomX(7));
        String id = service.getId();
        assertEquals("XYZ7", id);
    }
}
