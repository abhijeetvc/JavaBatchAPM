import java.util.*;

interface MyDemo{
    void showData();
}
public class ComparatorDemo {

    public static void main(String[] args) {


        MyDemo m=new MyDemo() {
            @Override
            public void showData() {
                System.out.println("In show data...");
            }
        };
        m.showData();

        Student s1=new Student();
        s1.setId(1);
        s1.setName("A");
        s1.setAge(30);

        Student s2=new Student();
        s2.setId(2);
        s2.setName("B");
        s2.setAge(20);

        Student s3=new Student();
        s3.setId(3);
        s3.setName("C");
        s3.setAge(20);

        List<Student> list=new ArrayList();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        System.out.println("Before sorting...");
        System.out.println(list);

        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        System.out.println("After sorting...");
        System.out.println(list);


        TreeSet<Integer> ts=new TreeSet<>();
        ts.add(30);
        ts.add(30);
        ts.add(20);
        ts.add(10);

        System.out.println(ts);

        Map<String,Object> map=new HashMap();
        map.put("a","John");
        map.put("b","Abhijeet");
        map.put("c",10);

        for(Map.Entry mm:map.entrySet()){
            System.out.println(mm.getKey()+" = "+mm.getValue());
        }
    }
}

// Comparable vs Comparator
// LinkedHashSet, Hashtable, Vector