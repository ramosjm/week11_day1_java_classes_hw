import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    private WaterBottle bottle;

    @Before
    public void before(){
        this.bottle = new WaterBottle(100);
    }

    @Test
    public void hasVolume(){
        assertEquals(100,bottle.getVolume());
    }

    @Test
    public void canDrink(){
        assertEquals(90,bottle.drink());
    }

    @Test
    public void isEmpty(){
        assertEquals(0,bottle.empty());
    }

    @Test
    public void canFill(){
        assertEquals(100,bottle.fill());
    }

}
