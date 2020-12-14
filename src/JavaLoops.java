import java.util.Arrays;
import java.util.List;

public class JavaLoops {

    public static void main(String[] args) {

//        for(int i=1;i<=5;++i){
//            System.out.println(i);
//        }

//        int i=1;
//        for(;i<=5;){
//            System.out.println(i);
//            i++;
//        }

        List<Integer> list= Arrays.asList(10,5,15,20,25,30);

        // Normal Java Loop
//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }

        //For-each loop
//        for(Integer a:list){
//            System.out.println(a);
//        }

        //Java 8, lambda expression
   //     list.forEach(a-> System.out.println(a));

        //Java 8, method reference (::) double colon operator
      //  list.forEach(System.out::println);

        //while loop
//        int i1=1;
//        while(i1<=5){
//            System.out.println(i1);
//            i1++;
//        }
//
        // do-while
        int x=10;
        do{
            System.out.println(x);
            x++;
        }while(x<=5);

    }
}

// a) Print all prime nos between 1 to 100
// b) Print the output as below:
//         *
//        * *
//       * * *
//      * * * *