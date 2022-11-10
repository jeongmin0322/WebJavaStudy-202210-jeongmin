package j19_컬렉션;

import java.util.*;

public class UserMap {
    public static void main(String[] args) {
        Map<String, String> userMap = new HashMap<String, String>();
        userMap.put("username","junil");
        userMap.put("password","1234");
        userMap.put("email","skjil1218@gmail.com");
        userMap.put("name","김준일");


//Set은 하나하나 콕 못찝어내니까 List를 사용하는거임
        Set<String> keySet = userMap.keySet();
        List<String> keyList = new ArrayList<String>();
        keyList.addAll(keySet);
        System.out.println(keyList);

        String keyName1 = keyList.get(0);
        String keyName2 = keyList.get(1);
        String keyName3 = keyList.get(2);
        String keyName4 = keyList.get(3);

        String value1 = userMap.get(keyName1);
        String value2 = userMap.get(keyName2);
        String value3 = userMap.get(keyName3);
        String value4 = userMap.get(keyName4);

//        for(int i=0; i<values.size(); i++){
//            System.out.println(userMap.keySet()+" >> "+userMap.values());
//        }
        System.out.println(keyName1 + " >> " +value1);
        System.out.println(keyName2 + " >> " +value2);
        System.out.println(keyName3 + " >> " +value3);
        System.out.println(keyName4 + " >> " +value4);

    }
}
