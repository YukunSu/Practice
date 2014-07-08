package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import src.circuits;

public class circuitsTest {

    public circuits circuits = new circuits();

    @Test
    public void test1() {
        String[] connects = { "1 2", "2", "" };
        String[] costs = { "5 3", "7", "" };
        int expected = 12;
        int actual = circuits.howLong(connects, costs);
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        String[] connects = { "1 2 3 4 5", "2 3 4 5", "3 4 5", "4 5", "5", "" };
        String[] costs = { "2 2 2 2 2", "2 2 2 2", "2 2 2", "2 2", "2", "" };
        int expected = 10;
        int actual = circuits.howLong(connects, costs);
        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        String[] connects = { "1", "2", "3", "", "5", "6", "7", "" };
        String[] costs = { "2", "2", "2", "", "3", "3", "3", "" };
        int expected = 9;
        int actual = circuits.howLong(connects, costs);
        assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        String[] connects = { "", "2 3 5", "4 5", "5 6", "7", "7 8", "8 9",
                "10", "10 11 12", "11", "12", "12", "" };
        String[] costs = { "", "3 2 9", "2 4", "6 9", "3", "1 2", "1 2", "5",
                "5 6 9", "2", "5", "3", "" };
        int expected = 22;
        int actual = circuits.howLong(connects, costs);
        assertEquals(expected, actual);
    }

    @Test
    public void test5() {
        String[] connects = { "", "2 3", "3 4 5", "4 6", "5 6", "7", "5 7", "" };
        String[] costs = { "", "30 50", "19 6 40", "12 10", "35 23", "8",
                "11 20", "" };
        int expected = 105;
        int actual = circuits.howLong(connects, costs);
        assertEquals(expected, actual);
    }
}
