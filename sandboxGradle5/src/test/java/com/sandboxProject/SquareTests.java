package com.sandboxProject;

import org.testng.Assert;
import org.testng.annotations.Test;


public class SquareTests {
    @Test
    public void testArea(){
        Square s = new Square(5);
        assert s.area()==25.0; // this variant doesn't count type of argument as double(work with integer)
        Assert.assertEquals(s.area(),25.0);
    }
}
