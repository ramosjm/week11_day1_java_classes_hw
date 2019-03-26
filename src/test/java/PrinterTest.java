import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {


    private Printer printer;

    @Before
    public void before(){
        this.printer = new Printer(10);
    }

    @Test
    public void hasPaper(){
        assertEquals(10,printer.getPaper());
    }

    @Test
    public void canPrint(){
        assertEquals(100, printer.print(25,4));
    }
    @Test
    public void hasEnoughPaperTrue(){
        Printer testPrinter = new Printer(200);
        assertEquals(true,testPrinter.hasEnoughPaper(25,4));
    }
    @Test
    public void hasEnoughPaperFalse(){
        assertEquals(false,printer.hasEnoughPaper(25,4));
    }
}

