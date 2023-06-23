import java.util.Arrays;
import java.util.List;

class MyList {
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(" " + obj);
        }
        System.out.println("\n=====================================");
    }
}

public class ListTest01 {
    public static void main(String[] args) {
        List<Double> li = Arrays.asList(10.3, 20.5);
        List<String> li2 = Arrays.asList("one", two);
        MyList.printList(li);
        MyList.printList(li2);
    }
}
