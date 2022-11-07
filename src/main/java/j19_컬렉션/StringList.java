package j19_컬렉션;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class StringList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(); //형식이 제네릭임! <>..
        printCollection(list);

        // 값 추가
        list.add("문자열1");
        list.add("문자열2");
        list.add("문자열3");
        list.add("문자열4");
        printCollection(list);

        list.add(1, "문자열5"); //1의 위치에다가 문자열5 넣기
        printCollection(list);

        ArrayList<String> addAllList = new ArrayList<String>();
        addAllList.addAll(list);
        addAllList.addAll(2,list);
        printCollection(addAllList);


        //값 조회
        String str1 = list.get(0); //0번째 있는 리스트를 꺼내라
        System.out.println(str1);


        //반복을 사용한 값 조회

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        for(String str : list){
            System.out.println("str: "+str);
        }

        Iterator<String> iterator = list.iterator();
        System.out.println("iterator 첫 생성시: "+iterator.next());
        //이렇게 적었지만 항상 hasNext해주는게 좋음

        while (iterator.hasNext()){ //hasNext : 다음이 있니?? 물어보는거
            System.out.println("iterator:"+iterator.next()); //next는 값을 꺼내는거
        }

//        System.out.println(iterator.next());


        //값 수정
        list.set(1,"문자열6");
        printCollection(list);

        //값 삭제
        list.remove(0);
        printCollection(list);

        for(int i=0; i<list.size(); i++){
            if(list.get(i).equals("문자열3")){//equals로 문자열3을 찾아라
                list.remove(i); //찾았으면 지우고
                break; //찾았으면 끝내라 <- 만약에 break문이 없으면 리스트안에 있는 모든 문자열3은 사라짐
            }
        }

        //값의 위치 찾기
        list.add("문자열2"); //추가 (맨 끝에 들어감)
        printCollection(list);

        int index = list.indexOf("문자열6");
        System.out.println("문자열6의 위치: "+ index);

        int lastIndex = list.lastIndexOf("문자열2");
        System.out.println("뒤에서 부터 찾은 문자열2의 위치: "+lastIndex);

        System.out.println();

        //값을 포함하고 있는지 여부 조회
        boolean isTrue = list.contains("문자열2");
        System.out.println("list에 문자열2가 포함되어 있는가?" + isTrue);


        //리스트를 배열로 변환
        Object[] objects = list.toArray(); //toArray가 Object라서 Object배열로 받아야함
        System.out.println(objects[0]);

        for(Object object : objects){
            System.out.println(object);
        }


    }



    public static void printCollection(Collection collection){
        System.out.println(collection);
        System.out.println();
    }
}
