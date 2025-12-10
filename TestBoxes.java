
import org.junit.*;
import static org.junit.Assert.*;

public class TestBoxes {
    private Thing truc1,truc2;

    @Before
    public void setUp(){
        truc1 = new Thing("truc1",3);
        truc2 = new Thing("truc2",5);
    }

    @Test
    public void testBoxCreate(){
        Box b = new Box();
    }

    @Test
    public void testBoxAdd(){
        Box b = new Box();
        Thing truc3 = new Thing("truc3",3);
        b.add(truc1);
        b.add(truc2);
        assertTrue(b.contains(truc1));

        assertTrue(b.contains(truc2));

        assertFalse(b.contains(truc3));
    }

    @Test
    public void testBoxAddCapacity(){
        Box b = new Box();
        b.setCapacity(10);
        Thing truc3 = new Thing("truc3",3);
        b.add(truc1);
        b.add(truc2);
        assertTrue(b.contains(truc1));

        assertTrue(b.contains(truc2));

        assertFalse(b.contains(truc3));
    }

    @Test(expected = RuntimeException.class)
    public void testBoxAddCapacityFull(){
        Box b = new Box();
        b.setCapacity(10);
        Thing truc3 = new Thing("truc3",3);
        b.add(truc1);
        b.add(truc2);
        assertTrue(b.contains(truc1));

        assertTrue(b.contains(truc2));

        assertFalse(b.contains(truc3));
        b.add(truc3);
    }

    @Test (expected = RuntimeException.class)
    public void testBoxRemoveException(){
        Box b = new Box();
        Thing truc3 = new Thing("truc3",3);
        b.add(truc1);
        b.add(truc2);
        b.remove(truc3);
    }

    @Test
    public void textBoxRemove(){
        Box b = new Box();
        Thing truc3 = new Thing("truc3",3);
        b.add(truc1);
        b.add(truc2);
        b.remove(truc2);
        assertTrue(b.contains(truc1));

        assertFalse(b.contains(truc2));

        assertFalse(b.contains(truc3));

    }

    @Test
    public void testThingVolume(){
        Box b = new Box();
        Thing truc3 = new Thing("truc3",3);
        assertTrue(truc3.getVolume() == 3);
    }

}