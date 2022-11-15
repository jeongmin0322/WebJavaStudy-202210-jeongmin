package j25_문자열;

public class String1 {
    public static void main(String3[] args) {

        String filePath = "C:/Users/junil/java-study/src/main/java/String.java";
        String filePath2 = "C:/Users/junil/project/java-study2/src/main/java/Integer.java";


        int srcIndex = filePath.indexOf("/src");
        String projectPath = filePath.substring(0,srcIndex);


        String projectName = projectPath.substring(projectPath.lastIndexOf("/")+1);
        String fileName = filePath.substring(filePath.lastIndexOf("/")+1,filePath.lastIndexOf(".")); //매개변수 2개고 시작과 끝을 말함
        String extension = filePath.substring(filePath.lastIndexOf("."));

        System.out.println("확장자명: "+extension);
        System.out.println("파일이름: " +fileName);
        System.out.println("프로젝트이름: "+projectName);


    }
}
