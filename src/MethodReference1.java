//Java 8: Method Reference -> (::)
// a) reference to static method of particular type
// b) reference to instance method of particular type
// c) reference to instance method of arbitrary object of particular type
// d) reference to constructor

import java.util.Arrays;
import java.util.List;

public class MethodReference1 {

    public static void main(String[] args) {
        List<String> list= Arrays.asList("India","US","France","Germany");

        //list.forEach(DemoCheck::check);

        DemoCheck d=new DemoCheck();
        list.forEach(d::display);
    }
}
class DemoCheck{

    public static void check(String str){
        System.out.println(str);
    }
    public void display(String str1){
        System.out.println(str1);
    }
}