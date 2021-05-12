package io.github.hb3nc3;

import io.github.hb3nc3.model.TestModel;
import java.util.*;

public class Main {

    public static void printSomething() {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        TestModel model = new TestModel();
        List<TestModel> models = new ArrayList();
        Map<Integer,TestModel> testMap = new HashMap();
        testMap.put(12, new TestModel());
        models.add(model);
        printSomething();
        model.x = 5;
        int[] array = {11,12,13,14,15};
        Integer[] arr2 = null;
        models.get(0).incrementAndPrint();
    }
}
