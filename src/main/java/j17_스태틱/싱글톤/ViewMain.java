package j17_스태틱.싱글톤;

import j17_스태틱.Product;

public class ViewMain {


    public static void main(String[] args) {
//        ProductView productView = new ProductView(); <private 라서 안됨
        ProductView productView = ProductView.getInstance();

//        productView.showMainView();
//        productView.showOrderView(); 아래 15,16과 같은 방식

        ProductView.getInstance().showMainView();
        ProductView.getInstance().showOrderView();
    }
}
