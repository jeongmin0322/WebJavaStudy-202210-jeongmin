package j24_foreach;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

public class CollectionForEach {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("김준일");
        list.add("김경민");
        list.add("김완준");
        list.add("이동빈");
        list.add("이종준");

        for(String name : list){
            System.out.println(name);
        }

        list.forEach(name -> {
            System.out.println(name);
        });

        Consumer<String> c = new Consumer<String>(){
            @Override
            public void accept(String name){
                System.out.println(name);
            }
        };

        Consumer<String> consumer = name -> {
            System.out.println(name);
        }; //int a =10; 해도 세미콜론 찍음 여기도 같은 원리



        System.out.println("\n\n");

        for(String name : Objects.requireNonNull(list)){
            consumer.accept(name);
        }

        //forEach랑 람다식써서 제일 줄인거,,
        list.forEach(name -> {

            System.out.println(name);
        });


        Set<Integer> numbers = new HashSet<Integer>();
        for(int i = 0; i <100; i++) {
            numbers.add(1+i);
        }

        AtomicInteger result = new AtomicInteger();
        numbers.forEach(num -> { //하나씩꺼냄
            result.addAndGet(num); //꺼내서 더함
            //+= 연산이랑 동일함 바로 윗줄
        });
        System.out.println(result.get());


        Map<Integer, String> students = new TreeMap<Integer, String>();
        for(int i=0; i < 10; i++) {
            students.put(20220001+i, "김준"+(i+1));
        }
        students.forEach((key, value) ->{
            System.out.println("학번: "+key+", 이름:"+value);
        });
    }
}
