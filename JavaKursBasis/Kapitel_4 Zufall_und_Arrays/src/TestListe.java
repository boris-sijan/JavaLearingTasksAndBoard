import java.util.ArrayList;

public class TestListe {
    public static void main(String[] args) {
        System.out.println("Testing arrays in Java");

        ArrayList<String> stringList = new ArrayList<>();

        stringList.add("Hello");
        System.out.println("ArrayList first element: " + stringList.get(0));

        stringList.add("World");
        System.out.println("ArrayList second element: " + stringList.get(1));

        stringList.remove(0);
        System.out.println("ArrayList first element after removal: " + stringList.get(0));

        //---------------------------------------------------------------------------------------------------------
        ArrayList<ArrayList<Integer>> outerList = new ArrayList<>();

        ArrayList<Integer> innerList1 = new ArrayList<>();
        innerList1.add(1);
        innerList1.add(2);
        innerList1.add(3);
        outerList.add(innerList1);

        ArrayList<Integer> innerList2 = new ArrayList<>();
        innerList2.add(4);
        innerList2.add(5);
        innerList2.add(6);
        outerList.add(innerList2);


        System.out.println("Element at outerList[0][1]: " + outerList.get(0).get(1)); // Should print 2
        System.out.println("Element at outerList[1][2]: " + outerList.get(1).get(2)); // Should print 6







    }

}
