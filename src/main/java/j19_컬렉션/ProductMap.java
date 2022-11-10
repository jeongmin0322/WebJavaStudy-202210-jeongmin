package j19_컬렉션;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@AllArgsConstructor
@Data

class ProductImg {
    private int imgCode;
    private String imgName;
}

public class ProductMap {
    public static void main(String[] args) {

        Map<String, Object> product = new HashMap<String, Object>(); //Object는 어느 자료형이든 들어갈 수 있다
        product.put("productCode", 1);
        product.put("productName","스타벅스 블랙 텀블러");
        product.put("productColor","Black");
        product.put("productSize","Venti");

        List<ProductImg> productImgs = new ArrayList<ProductImg>();
        productImgs.add(new ProductImg(1, "starbucks_black_tumbler1.png"));
        productImgs.add(new ProductImg(2, "starbucks_black_tumbler2.png"));
        productImgs.add(new ProductImg(3, "starbucks_black_tumbler3.png"));
        productImgs.add(new ProductImg(4, "starbucks_black_tumbler4.png"));

        product.put("productImg",null);

 /*
        텀블러이미지1: starbucks_black_tumbler1.png
        텀블러이미지2: starbucks_black_tumbler2.png
        텀블러이미지3: starbucks_black_tumbler3.png
        텀블러이미지4: starbucks_black_tumbler4.png
         */


        List<ProductImg> productImgList = (List<ProductImg>) product.get("productImg"); // 이 값은 object임 , 다운캐스팅 List

        for(ProductImg img : productImgList){
            System.out.println("텀블러이미지" + img.getImgCode() + ": "+img.getImgName());
        }




        }
    }
