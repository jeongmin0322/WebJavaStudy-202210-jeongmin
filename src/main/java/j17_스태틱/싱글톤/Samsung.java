package j17_스태틱.싱글톤;

import lombok.Getter;


public class Samsung {

    @Getter //이런식으로 하면 9번줄 얘만 Getter 생김
    private String company;
    private int serialNumber;

    private static Samsung instance = null; //자기자신의 주소 instance!!!!!!~
    private Samsung() { //원래는 public인데 여기서는 private !! 딱 하나만 생성될 수 있으니까
        company = getClass().getSimpleName(); //클래스명 가지고옴.. 이거 뭔말인교,,
        serialNumber = 20220000; //Samsung이라는 주소안에 회사=삼성이라는 값과 시리얼넘버 20220000이 들어가있다.
    }

    public static Samsung getInstance() {
        if(instance == null){
            instance = new Samsung();
        }
        return instance;
    }
    public String createSerialNumber(String model) {
        return model+"_"+ ++serialNumber;
    }




}
