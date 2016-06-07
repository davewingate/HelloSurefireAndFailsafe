package hello;

import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(IntegrationTest.class)
public class AppIntegrationTest {

    @Test
    public void integrationTest() {
        System.out.println(">>>>>>>>>>>>>>> ran the integration test <<<<<<<<<<<<<<<");
    }

}

