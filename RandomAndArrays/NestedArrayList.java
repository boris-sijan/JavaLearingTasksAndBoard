package RandomAndArrays;

import java.util.ArrayList;

public class NestedArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> outerList = new ArrayList<>();

        ArrayList<Integer> innerList1 = new ArrayList<>();
        innerList1.add(1);
        innerList1.add(2);
        innerList1.add(3);

        ArrayList<Integer> innerList2 = new ArrayList<>();
        innerList2.add(4);
        innerList2.add(5);
        innerList2.add(6);

        outerList.add(innerList1);
        outerList.add(innerList2);

        //access the elements in the nested ArrayList by specifying the index of the outer and inner elements
        int firstElementOfFirstList = outerList.get(0).get(0);  //This returns the first entry of `innerList1`
        int thirdElementOfSecondList = outerList.get(1).get(2);  //This returns the third entry of `innerList2// `

        System.out.println("size: " + outerList.size());
        System.out.println("isEmpty: " + outerList.isEmpty());
        System.out.println("contains: " + innerList1.contains(3));
        System.out.println("indexOf: " + innerList1.indexOf(3));
    }
}
