package dip;

import java.util.Random;

public class GenerateIdService {
    Random random;

    public void setRandom(Random random) {
        this.random = random;
    }

    public String getId() {
        int number = random.nextInt(10);
        return  "XYZ" + number;
    }
}
