import java.util.ArrayList;
import java.util.Collections;

public class SortExample {
    public static void main(String[] args) {
        ArrayList<emps> empsList = new ArrayList<>();
        empsList.add(new emps("Durgesh", "28273", 71));
        empsList.add(new emps("Arjun", "82721", 81));
        empsList.add(new emps("Pritam", "821831", 141));
        empsList.add(new emps("Pavan", "8173", 84));

        System.out.println("Original list:");
        for (emps emp : empsList) {
            System.out.println(emp);
        }

    }
}
