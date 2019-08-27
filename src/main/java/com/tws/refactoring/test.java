package com.tws.refactoring;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class test {
//    @Test
//    public void should_return_true_if_input_17() {
//        int age = 17;
//
//
//    }
@Test
public void should_return_true_if_driver_age_big_than_eighteen() {
    //given
    Police police = new Police();
    Driver driver = new Driver(49);
    //when
    boolean result= police.checkDriver(driver);
    //then
    assertEquals(true, result);

}
    @Test
    public void should_return_false_if_driver_age_big_than_eighteen() {
        //given
        Police police = new Police();
        Driver driver = new Driver(16);
        //when
        boolean result= police.checkDriver(driver);
        //then
        assertEquals(false, result);

    }
}
