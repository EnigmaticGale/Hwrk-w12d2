import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void before() {
        visitor = new Visitor(20,10,100);
    }

    @Test
    public void canGetParameters () {
        assertEquals(20, visitor.getAge());
        assertEquals(10,visitor.getHeight());
        assertEquals(100,visitor.getMoney(),0.01);
    }
}
