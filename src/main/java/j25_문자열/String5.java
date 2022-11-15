package j25_문자열;

public class String5 {
    public static void main(String[] args) {
        String httpMethod = "Get";

        if(httpMethod.equalsIgnoreCase("GET")){
            System.out.println("get요청입니다.");
        }else{
            System.out.println("get요청이 아닙니다.");
        }
    }
}
