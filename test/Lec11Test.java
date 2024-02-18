package test;

import src.ArrList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class Lec11Test {

    @Test
    public void testList() {
        ArrList testArray = new ArrList(2);
        Assert.assertTrue(testArray.isEmpty());
        Assert.assertFalse(testArray.isFull());
        testArray.addLast("hello");
        testArray.addLast("there");
        Assert.assertEquals("there", testArray.get(1));
        testArray.addLast("brown");
        Assert.assertEquals(null, testArray.get(3));
        testArray.addLast("bear");
        Assert.assertTrue(testArray.isFull());

        testArray.addLast("!");
        Assert.assertEquals(8, testArray.capacity());
    }
}
