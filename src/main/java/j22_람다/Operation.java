package j22_람다;

@FunctionalInterface // 안달아줘도 되지만~ 추상메소드를 2개 이상 못달게 해줌! 람다쓰려고 만든거구나 라고 알려줌
public interface Operation {
    public int calc(int x, int y);
//    public int calc2(int x, int y); <이건 있으면 안됨
    public default String resultToString(int result){
        return "결과: "+result; //< default함수는 있어도됨
    }


}
