package dip;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GenerateIdServiceTest {
    @Test
    @DisplayName("ต้องได้ id=XYZ7")
    public void case01() {
        GenerateIdService service = new GenerateIdService();
        String id = service.getId();
        assertEquals("XYZ7", id);
    }
}
