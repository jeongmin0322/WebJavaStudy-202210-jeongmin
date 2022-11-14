package j23_예외;

import lombok.Getter;

import java.util.Map;

public class CustomException extends RuntimeException{

    @Getter //외부로 가져갈 수 있어야하기 때문에
    private Map<String, String> errorMap;

    public CustomException(String message, Map<String, String> errorMap) { //컨트롤+insert 생성자 두번째거
        super(message);
        this.errorMap = errorMap;
    }
}
