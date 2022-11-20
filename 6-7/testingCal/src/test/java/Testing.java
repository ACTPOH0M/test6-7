import org.example.Main;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Testing {

    @Test
    public void testMultiplication()  {   //2*2
        assertEquals(4, Main.calc(2,2,'*'));
    }

    @Test
    public  void testSum()
    {
        assertEquals(10,Main.calc(4,6,'+'));
    }
    @Test
    public  void testDifference()
    {
        assertEquals(-2,Main.calc(4,6,'-'));
    }
    @Test
    public  void testDivision()
    {
        assertEquals(11,Main.calc(66,6,'/'));
    }
    @Test
    public  void testMultiplicationByZero()
    {
        assertEquals(0,Main.calc(66,0,'*'));
    }
    @Test
    public  void testDivisionByZero()
    {   //false
        assertEquals(4,Main.calc(66,0,'/'));
    }
}
