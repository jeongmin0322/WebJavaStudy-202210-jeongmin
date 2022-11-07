package j12_상속;

public class Animal {
    //public String name; < 변수는 항상 public말고 private로 주기. 변수 상속방법임
    private String name;

    public Animal(String name){
        System.out.println("Animal 생성");
        this.name = name;
    }

    public void move() {
        System.out.println("움직입니다.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
