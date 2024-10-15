package org.factoriaf5;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class AppTest 
{
    @Test
    public void tablaDeMultiplicarTest()
    {
        App app=new App();
        String[]s = {
            "5 x 1 = 5",
            "5 x 2 = 10",
            "5 x 3 = 15",
            "5 x 4 = 20",
            "5 x 5 = 25",
            "5 x 6 = 30",
            "5 x 7 = 35",
            "5 x 8 = 40",
            "5 x 9 = 45",
            "5 x 10 = 50",
        };
        assertTrue(Arrays.equals(app.tablaDeMultiplicar(5), s));
    }
}
