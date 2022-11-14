package j22_람다;

public class OperationMain {
    public static void main(String[] args) {

        int a = 10, b = 20;


        Operation add = new Operation(){
            @Override
            public int calc(int x, int y) {
                return x + y;
            }
        };

        //이 한줄이 저 위에 긴 코드랑 같은 역할을함ㄷㄷ대박~ 익명함수를 정의하고 생성한거임
        //람다는 메소드 2개를 정의할 수 없고 꼭 하나만 해야됨
        Operation add2 = (x,y) -> x+y;

        Operation sub = (x, y) -> x - y; //(중괄호가 있으면 여러개 쓸 수 있다는거여서 그러면안됨 return 생략할때!!! 중괄호도 노노)

        Operation multi = (x, y) -> x * y;

        Operation div = (x, y) -> x / y;
        System.out.println(sub.resultToString(sub.calc(b,a)));
        System.out.println(sub.resultToString(multi.calc(b,a)));
        System.out.println(sub.resultToString(div.calc(b,a)));

        int addResult= add.calc(a,b);
        System.out.println(a+" + "+b+" = "+addResult);


        int addResult2= add.calc(a,b);
        System.out.println(a+" + "+b+" = "+addResult2);



    }
}
