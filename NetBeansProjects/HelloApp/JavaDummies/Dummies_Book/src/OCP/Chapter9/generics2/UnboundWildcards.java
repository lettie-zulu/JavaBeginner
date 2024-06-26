package OCP.Chapter9.generics2;

import java.util.ArrayList;
import java.util.List;

public class UnboundWildcards {
    public static void printList(List<?> list) {
        for (Object x: list)
            System.out.println(x);
    }

    public static void main(String[] args) {
        List<String> keywords = new ArrayList<>();
        keywords.add("java");

        List<Object> objects = new ArrayList<>();
        objects.add(new Object());

        printList(keywords);
        printList(objects);
    }

}
