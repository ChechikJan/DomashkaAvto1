package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void amountLessBoundary() {
        int amount = 850;
        int actual = service.remain(amount);
        int expected = 150;
        assertEquals(actual, expected);

    }
    @Test
    public void amountEqualToBoundary() {
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);

    }
    @Test
    public void amountMoreToBoundary() {
        int amount = 1600;
        int actual = service.remain(amount);
        int expected = 400;
        assertEquals(actual, expected);

    }

}