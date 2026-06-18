package stepDef;

import context.TestContext;
import invoker.DriverProvider;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    private final TestContext testContext;

    public Hooks(TestContext testContext) {
        this.testContext = testContext;
    }

    @Before
    public void setup() {
        testContext.setDriver(DriverProvider.getdriver("chrome"));


    }

    @After
    public void teardown() {

    }

}
