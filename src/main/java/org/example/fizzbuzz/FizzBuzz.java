package org.example.fizzbuzz;

public class FizzBuzz {
    public String fizzbuzzPruefung(int i) {
        // TODO
        if(i % 3 == 0 ) {
            return "Fizz";
        }
        if(i % 5 == 0 ) {
            return "Buzz";
        }
        return String.valueOf(i);
    }
}
