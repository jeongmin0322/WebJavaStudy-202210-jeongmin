package j12_상속;

public class Human extends Animal {

    public Human(String name){ //human클래스의 생성자
//        super(); 실행할 때 Animal 생성되는 이유: 얘가 숨겨져 있음->부모의 주소를 가리킴
//        super.move();
        super(name);
        System.out.println("Human 생성");
//      8,9번 바뀌면 안됨 부모생성자가 항상 젤 위에 있어야됨.. 부모먼저 있어야됨 자식이 어딜!@!
    }

//    public void runMove(){
//        name; 은 안됨 상속을 받았더라도.. private라고 정의했기 때문에
//        move();


    /*
        메소드 오버라이딩(오버라이드)
        [ 재정의 ]
        상위(Animal) 객체의 메소드를 하위(Human) 객체에서 다시 정의하는 행위
     */
    @Override // @(어노테이션):// 해당 메소드가 상위 객체로부터 재정의된 메소드입니다를 표기
    public void move(){
        //move(); 이건 자기자신을 호출함 this.move(); 무한반복된다.. 재귀함수
        super.move();
        System.out.println("두 발로 걷습니다.");

    }
}


