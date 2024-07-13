package org.example.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamsUeben {
    // 1. Stream API
    //Schreiben bzw. nutzen Sie die Klasse Streams üben.
    //Schreiben Sie für jede Teilaufgabe eine Methode, die eine Collection als Parameter enthält und das gewünschte Ergebnis als Rückgabe. Schreiben Sie für jede Methode 2 Test und skizzieren Sie als Kommentare, welche weiteren Test Sie schreiben würden.
    //a) Nutzen Sie die Stream API um eine Liste zu erzeugen, die nur die gerade Zahlen enthält
    //b) Nutzen Sie die Stream API um eine Liste zu erzeugen, die nur die Zahlen enthält, die durch 3 teilbar sind


    // erzeugen Sie eine Liste mit Zahlen von 1 bis 10
    List<Integer> liste2 = IntStream.range(1, 11).boxed().toList();
    List<Integer> liste3 = Arrays.asList(1,2,3,4,5,6,7,8,9, 10);
    List<Integer> list = initList();

    List<Integer> initList() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        return list;
    }

    // Nutzen Sie die Stream API um eine Liste zu erzeugen, die nur die gerade Zahlen enthält
    // Schreiben Sie hierfür einen Test
    public List<Integer> straight(List<Integer> input) {
        return input.stream().filter(n -> n %2 == 0).toList();
    }

    // Nutzen Sie die Stream API um eine Liste zu erzeugen, die nur die Zahlen enthält, die
    // durch 3 teilbar sind
    // Schreiben Sie hierfür einen Test
    public List<Integer> teilbarDurchDrei(List<Integer> input) {
        return input.stream().filter(n -> n %3 == 0).toList();
    }

}
