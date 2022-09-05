package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void amountLessBoundary() {
        int amount = 450;
        int actual = service.remain(amount);
        int expected = 550;
        assertEquals(expected, actual);

    }

    @Test
    public void amountEqualToBoundary() {
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);

    }

    @Test
    public void amountMoreToBoundary() {
        int amount = 3700;
        int actual = service.remain(amount);
        int expected = 300;
        assertEquals(expected, actual);

    }

}