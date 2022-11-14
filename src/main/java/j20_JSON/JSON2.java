package j20_JSON;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@Data

class User {
    private String username;
    private String password;
    private String email;
    private String name;
}
public class JSON2 {
    public static void main(String[] args) {
        // Gson(toJson)으로 변환할 수 있는 객체의 종류
        // JsonObject, Object, Map << 얘네들!


        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create(); //밑줄이랑 똑같음
        Gson gson = new Gson();

        String userJson = null;
        String studentJson = null;
        String productJson = null;

        // Object(객체) -> JSON
        User user = new User("junil","1234","skjil1218@gmail.com","김준일");
        System.out.println(gsonBuilder.toJson(user));
        System.out.println(gson.toJson(user));
        //문법은 동일한테 PrettyPrinting이 예쁘니까 얘로 ㄱ
        userJson = gsonBuilder.toJson(user);


        // JsonObject -> JSON
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("studentCode","20220001");
        jsonObject.addProperty("studentName","김준이");
        jsonObject.addProperty("studentYear","2");
        System.out.println(gsonBuilder.toJson(jsonObject));
        studentJson = gsonBuilder.toJson(jsonObject);


        //Map -> JSON
        Map<String, Object> map = new HashMap<String,Object>();
        map.put("productCode","P-20220001");
        map.put("productName","삼성 노트북");
        System.out.println(gsonBuilder.toJson(map));
        productJson = gsonBuilder.toJson(map);



        // JSON -> Map
        Map<String, Object> jsonData = convertJsonToMap(userJson);
        System.out.println(jsonData.get("name"));

        jsonData = convertJsonToMap(studentJson);
        System.out.println(jsonData);

        jsonData = convertJsonToMap(productJson);
        System.out.println(jsonData);

        // JSON -> JsonObject
        JsonObject jsonObj = convertJsonToJsonObject(userJson);
        jsonObj = convertJsonToJsonObject(studentJson);
        jsonObj = convertJsonToJsonObject(productJson);


        System.out.println("\n\n");

        // JSON -> User
        User userObj = convertJsonToUser(userJson);
        System.out.println(userObj);
    }

    public static Map convertJsonToMap(String json){
        Gson gson = new Gson();
        return gson.fromJson(json,Map.class); //앞쪽에는 json, 뒤쪽에는 변환하고자 하는 것
    }

    public static JsonObject convertJsonToJsonObject(String json){
        Gson gson = new Gson();
        return gson.fromJson(json,JsonObject.class);
    }

    public static User convertJsonToUser(String json){
        Gson gson = new Gson();
        return gson.fromJson(json,User.class);
    }
}
