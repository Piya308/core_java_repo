package org.generics;

import java.util.ArrayList;
import java.util.List;

public class WildCardsInGenerics {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

}

class Main2 {

    // It takes an ArrayList<?>, meaning a list of unknown type.
    // It returns the first element in the list as an Object.
    public Object getFirst(ArrayList<?> list) {
        return list.get(0);
    }

    //we can't use <?> in below case why?? because source and destination should be same
    public <T> void copy(ArrayList<T> source, ArrayList<T> destination) {
        for (T item : source) {
            destination.add(item);
        }
    }

    //Use <? super T> when you're writing values and want to accept supertypes.
    public <T> void addIntegers(List<? super Integer> list) {
        int n = 3; //autoboxed to Integer
        list.add(n);
    }
}

}
