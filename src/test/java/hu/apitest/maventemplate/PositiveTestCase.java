package hu.apitest.maventemplate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PositiveTestCase extends ApplicationTests {

    @Test
    public void firstPositiveTestCase(){
        logger.info("First test running...");
        assertTrue(true, "Should be true");
    }
}
