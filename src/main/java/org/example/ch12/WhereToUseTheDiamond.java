package org.example.ch12;

import java.util.ArrayList;
import java.util.List;

public class WhereToUseTheDiamond {
    public static List<String> foo(List<String> list) {
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list = new ArrayList<>();
        foo(new ArrayList<>(list));

        List<String> list1 = new ArrayList<>();
        var list2 = new ArrayList<String>();
        var list3 = new ArrayList<>();
    }
}
