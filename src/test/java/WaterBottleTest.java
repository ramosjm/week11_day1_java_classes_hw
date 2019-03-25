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
        bottle.drink();
        assertEquals(90,bottle.getVolume());
    }

    @Test
    public void isEmpty(){
        bottle.empty();
        assertEquals(0,bottle.getVolume());
    }

    @Test
    public void canFill(){
        bottle.fill();
        assertEquals(100,bottle.getVolume());
    }

}
