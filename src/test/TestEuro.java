package test;
import static org.junit.Assert.assertNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import code.Business_logic.Euro;

public class TestEuro {

    private Euro euroTest, euroTest1, euroTest2, euroTest3,euroTest4;
    
    @Before
    public void setUp(){
        euroTest = new Euro(125,55);
        euroTest1 = new Euro(129,99);
        euroTest2 = new Euro(6,20);
        euroTest3 = new Euro(25,25);
        euroTest4 = new Euro(77,30);
    }
    
    @After
    public void clear(){
        euroTest = null;
        assertNull(euroTest);
    }


    @Test
    public void testGetValore() {

    }

    @Test
    public void testMinoreDi() {

    }

    @Test
    public void testSomma() {

    }

    @Test
    public void testSottrai() {

    }

    @Test
    public void testStampa() {

    }

    @Test
    public void testUgualeA() {

    }
}
