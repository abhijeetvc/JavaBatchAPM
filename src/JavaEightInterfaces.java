import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

//interface Demo{
//    Integer calculateLength(String str);
//}

public class JavaEightInterfaces {

    public static void main(String[] args) {

        //Functional Interface
        Function<String,Integer> f=str->str.length();
        Integer i=f.apply("Abhi");
        System.out.println("value of i: "+i);

        //BiFunction
        BiFunction<Integer,Integer,Integer> bi=(a,b)->a+b;
        Integer i1=bi.apply(30,50);
        System.out.println("Value of i1: "+i1);

        //Function chaining
        Function<String,Integer> f2=str->str.length();  // 4
        Function<Integer,Integer> f3=val->val*10;  // 4 * 10 =40

        Integer i3=f2.andThen(f3).apply("Abhi");
        System.out.println("Value of i3: "+i3);

        //BinaryOperator
        BinaryOperator<Integer> bin=(a,b)->a+b;
        Integer i4=bin.apply(50,60);
        System.out.println("Value of i4: "+i4);

        UnaryOperator<Integer> u=value->value+10;
        Integer i5=u.apply(90);
        System.out.println("Value of i5: "+i5);

        //Predicate

        List<Integer> list= Arrays.asList(10,5,20,30,25,40);
//        List<Integer> newList=new ArrayList<>();
//        for(Integer a:list){
//            if(a>10){
//                newList.add(a);
//            }
//        }
//        System.out.println("New List is: "+newList);
        Predicate<Integer> p=x->x>=10;
        List<Integer> newList=list.stream().filter(p).collect(Collectors.toList());
        System.out.println("New list: "+newList);

        //BiPredicate
        BiPredicate<String,Integer> p1=(str,value)-> {
             return str.length()==value;
        };
        boolean flag=p1.test("Abhijeet",8);
        System.out.println("Flag is: "+flag);

        // Consumer
//        List<Integer> myList=Arrays.asList(40,20,30,25,50,60);
//
//        myList.forEach(x-> System.out.println(x));

        Consumer<Integer> c=a-> System.out.println(a);
        c.accept(50);

        //BiConsumer
        BiConsumer<Integer,Integer> bic=(a,b)-> System.out.println(a+b);
        bic.accept(30,40);

//        JavaEightInterfaces j=new JavaEightInterfaces();
//        Integer value=j.calculateLength("Abhi");
//        System.out.println("Length: "+value);

    }

//    @Override
//    public Integer calculateLength(String str) {
//        return str.length();
//    }
}
