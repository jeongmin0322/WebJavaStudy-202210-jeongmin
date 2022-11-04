package j18_제네릭.와일드카드;

public class Main {

    public AnimalData<? extends Animal> getAnimal(int flag){ //와일드카드 <?> 는 어떠한 형태가 와도 된다는 뜻!!!!!
        //<? extends Animal 란 >> 어떤 자료형을 다.. 가능하지만 Animal 상속받은 애들만 리턴가능하게해라!!!
        if(flag == 1){
            AnimalData<Human> animalData = new AnimalData<Human>(new Human());
            return animalData;
        }else if(flag == 2) {
            AnimalData<Tiger> animalData = new AnimalData<Tiger>(new Tiger());
            return animalData;
//        else if(flag == 3){
//            AnimalData<Car> animalData = new AnimalData<Car>(new Car("k8"));
//            return animalData;
        }
            return null;
    }


    public static void main(String[] args) {
        Main main = new Main();

        System.out.println(main.getAnimal(3));

    }
}
