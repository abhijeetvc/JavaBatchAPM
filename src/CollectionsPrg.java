import java.util.*;

public class CollectionsPrg {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList();

        ArrayList<Integer> arrList=new ArrayList<>();
        list.add(10);
        list.add(30);
        list.add(40);
        System.out.println("List: "+list);

        List<Integer> list1=new ArrayList();
        list1.add(50);
        list1.add(60);
        list1.add(70);
        list1.add(70);

        list.add(0,100);
        list.addAll(list1);
        System.out.println("New List: "+list);

        //Iterator Interface
        Iterator<Integer> itr=list.iterator();
        while(itr.hasNext()){
            System.out.println("List Value: "+itr.next());
        }

        // Set Interface
        Set<String> strSet=new HashSet();
        strSet.add("India");
        strSet.add("US");
        strSet.add("France");
        strSet.add("Australia");
        strSet.add("Australia");

        System.out.println("Set Values: "+strSet);


        List<Integer> list2=Arrays.asList(40,20,10,60,70,15);
        Collections.sort(list2);

        System.out.println(list2);

        List<String> countries=Arrays.asList("India","US","China","France");

    }
}
