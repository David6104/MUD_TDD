
import org.junit.*;
import static org.junit.Assert.*;

public class TestBoxes {
    private Thing truc1,truc2;

    @Before
    public void setUp(){
        truc1 = new Thing("truc1");
        truc2 = new Thing("truc2");
    }

    @Test
    public void testBoxCreate(){
        Box b = new Box();
    }

    @Test
    public void testBoxAdd(){
        Box b = new Box();
        Thing truc3 = new Thing("truc3");
        b.add(truc1);
        b.add(truc2);
        assertTrue(b.contains(truc1));

        assertTrue(b.contains(truc2));

        assertFalse(b.contains(truc3));
    }

    @Test (expected = RuntimeException.class)
    public void testBoxRemoveException(){
        Box b = new Box();
        Thing truc3 = new Thing("truc3");
        b.add(truc1);
        b.add(truc2);
        b.remove(truc3);
    }

    @Test
    public void textBoxRemove(){
        Box b = new Box();
        Thing truc3 = new Thing("truc3");
        b.add(truc1);
        b.add(truc2);
        b.remove(truc2);
        assertTrue(b.contains(truc1));

        assertFalse(b.contains(truc2));

        assertFalse(b.contains(truc3));

    }

}