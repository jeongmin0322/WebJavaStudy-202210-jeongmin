package j14_참조자료형캐스팅.동물;

//업캐스팅의 목적: 반복

public class AnimalArrayMain {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];

        animals[0] = new Human();
        animals[1] = new Tiger();
        animals[2] = new Human();
        animals[3] = new Tiger();

        for(int i=0; i<animals.length; i++) {
            animals[i].move();
        }

        for(int i=0; i<animals.length; i++) {
            if(animals[i] instanceof Human) { //animals[i]이 Human으로 생성된 애인지
//                Human h = (Human)animals[i];
//                h.readBooks();
                ((Human) animals[i]).readBooks(); //20,21과 같은 말
            }else if(animals[i] instanceof Tiger){
                ((Tiger) animals[i]).hunting();
            }
        }

    }
}
