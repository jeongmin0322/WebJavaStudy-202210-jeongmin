package j17_스태틱;




import lombok.AllArgsConstructor;
import lombok.Data;

@Data

public class Product {
    public static int autoIncrement = 20220000;

    private int serialNumber;
    private String productName;


    public Product(String productName) {
        serialNumber = ++autoIncrement; //생성될 때 마다 1씩 증가된 값이 유지가 되고있다.
        this.productName = productName;
    }

    public static int getAutoIncrement() {
        return autoIncrement;
    }

    public static void printInfo(){
        //System.out.println(productName); <생성이 되어야 쓸 수 있는데 static은 생성없이 쓸 수 있게함.. 모순임!!!
        // 맴버변수는 스태틱 메소드에서 사용할 수 없다.
        //쓸 수 있는 방법은 자기자신을 생성하면 쓸 수 이씀
        Product product = new Product("product");
        System.out.println(product.productName);
        System.out.println(autoIncrement);
    }

}
