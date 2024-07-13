package org.example.streams;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StreamsUebenTest {

    @Test
    public void testStreamsUeben() {
        StreamsUeben streamsUeben = new StreamsUeben();
        List<Integer> result = streamsUeben.initList();
        assertEquals(10, result.size());
        assertTrue(result.containsAll(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)));

        assertEquals(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), result);
    }

    @Test
    public void testStraight() {
        StreamsUeben streamsUeben = new StreamsUeben();
        List<Integer> result = streamsUeben.straight(streamsUeben.initList());
        List<Integer> expected = List.of(2, 4, 6, 8, 10);
        assertEquals(expected, result);
    }

    @Test
    public void testStraightLeereListe() {
        StreamsUeben streamsUeben = new StreamsUeben();
        List<Integer> result = streamsUeben.straight(new ArrayList<>());
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, result);
    }

    @Test
    public void testStraightNull() {
        StreamsUeben streamsUeben = new StreamsUeben();
        // List<Integer> result = streamsUeben.straight(null);
        // es fliegt ein Nullpointer -> ich teste auf diesen
        assertThrows(NullPointerException.class, () -> streamsUeben.straight(null));
    }

    @Test
    public void teilbarDurchDreiEinElement() {
        StreamsUeben streamsUeben = new StreamsUeben();
        List<Integer> result = streamsUeben.teilbarDurchDrei(Arrays.asList(3));
        List<Integer> expected = List.of(3);
        assertEquals(expected, result);
    }

    @Test
    public void teilbarDurchDreiEinElementKeineDrei() {
        StreamsUeben streamsUeben = new StreamsUeben();
        List<Integer> result = streamsUeben.teilbarDurchDrei(Arrays.asList(5));
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, result);
    }
}