package j19_컬렉션;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringSet {
    public static void main(String[] args) {

        //값 추가
        Set<String> strSet = new HashSet<String>();
        List<String> strList = new ArrayList<String>();
        strList.add("이동빈");
        strList.add("이승아");
        strList.add("우예희");
        strList.add("이종준");
        strList.add("변상원");
        strList.add("김준일");

        strSet.add("김준일");
        strSet.add("장혜민");
        strSet.add("정순동");
        strSet.add("김완준");
        strSet.add("송아셀");

        strSet.addAll(strList);
        System.out.println(strSet);



        //값 조회 - get으로는 조회할 수 없다.

        /*
        strSet에 searchName이 있으면 true, 없으면 false
         */
//        String searchName = "김준이";
//
//        boolean isTrue = false;
//        for(String name : strSet){
//            if(name.equals(searchName)){
//               isTrue = true; //하나라도 맞는게 들어가있으면 true
//                break;
//            }
//        }
//        System.out.println(isTrue);


        //값 수정
        /*
              송아셀 학생의 이름이 있으면 남강석으로 바꿔라
         */
        String searchName = "송아셀";

        for(String name : strSet){
            if(name.equals(searchName)){
                strSet.remove(searchName);
                strSet.add("남강석");
                System.out.println(strSet);
                break;
            }
        }

        searchName = "김준일";
        System.out.println(strSet.contains(searchName));
        if(strSet.contains(searchName)){
            strSet.remove(searchName);
            strSet.add("김준이");
        }
        System.out.println(strSet);



    }
}
