package j17_스태틱.싱글톤;

public class FactoryMain {
    public static void main(String[] args) {

        Factory factory1 = new Factory("1공장");
        Factory factory2 = new Factory("2공장");
        Factory factory3 = new Factory("3공장");
        Factory factory4 = new Factory("4공장");

        SmartPhone smartPhone1 = factory1.productSmartPhone();
        SmartPhone smartPhone2 = factory2.productSmartPhone();
        SmartPhone smartPhone3 = factory3.productSmartPhone();
        SmartPhone smartPhone4 = factory4.productSmartPhone();


        System.out.println(smartPhone1);
        System.out.println(smartPhone2);
        System.out.println(smartPhone3);
        System.out.println(smartPhone4);
    }
}
