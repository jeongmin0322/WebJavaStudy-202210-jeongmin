package j25_문자열;

public class String6 {
    public static void main(String[] args) {
        String httpRequest = "";

        /*
            문자열이 비어있지 않으면
            1. numm (x) _ 참고 null이랑 빈값이랑 다름.. null은 주소값이 null
            2. "" 빈 값 (x)
            3. " " 스페이스바 (x)
         */


        if(!httpRequest.isBlank()) {
            System.out.println(httpRequest);
        }else {
            System.out.println("공백은 사용할 수 없습니다.");
        }
    }
}
