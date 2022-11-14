package j22_람다;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        // Runnable -> 스레드에서 많이 쓰임
        Runnable runnable1 = () ->{ //return이 없으니까 중괄호연다
            System.out.println("첫번째 프로그램을 실행합니다.");
        };
        Runnable runnable2 = () ->{
            System.out.println("두번째 프로그램을 실행합니다.");
        };

        runnable1.run();
        runnable2.run();

        //스레드라는것은 프로그램이 같이 도는거임 원래 하나씩도는데!!!!

        Thread thread1 = new Thread(() ->{
            for(int i=0; i<100; i++){
                try {
                    Thread.sleep(100);
                    System.out.println("쓰레드1: "+i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread thread2 = new Thread(() ->{
            for(int i=0; i<100; i++){
                try {
                    Thread.sleep(100);
                    System.out.println("쓰레드2: "+i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

//        thread1.start();
//        thread2.start();

        Supplier<String> supplier = () -> "공급";
        System.out.println(supplier.get());


        Consumer<String> consumer = name -> { //매개변수가 하나인경우에는 (name)에서 괄호도 없앨 수 있음!
            System.out.println("이름: "+name);
        };
        consumer.accept("김준일");

        //바이너리가 들어오면 매개변수가 2개씩!!!
        Function<Integer, String> function = age -> "나이: " + age;
        System.out.println(function.apply(29));

        Predicate<Integer> leapMonth = year -> year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        System.out.println(leapMonth.test(2000));
    }
}
