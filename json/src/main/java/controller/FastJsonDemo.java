package controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import pojo.User;

import java.util.ArrayList;

public class FastJsonDemo {

    public static void main(String[] args) {

        //创建一个对象
        User user = new User("小零食", 23, "女");
        User user2 = new User("小沙发", 8, "男");
        User user3 = new User("小芬芬", 9, "女");
        User user4 = new User("小飞飞", 17, "女");
        ArrayList<User> list = new ArrayList<User>();
        list.add(user);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        System.out.println("*******Java对象 转 JSON字符串*******");
        String s = JSON.toJSONString(user);

        System.out.println("JSON.toJSONString(list)==>"+s);
        String s2 = JSON.toJSONString(user2);
        System.out.println("JSON.toJSONString(list)==>"+s2);


        System.out.println("\n****** JSON字符串 转 Java对象*******");
        User jp1 = JSON.parseObject(s2, User.class);
        System.out.println("JSON.parseObject(str2,User.class)==>"+jp1);

        System.out.println("\n****** Java对象 转 JSON对象 ******");
        JSONObject jsonObject = (JSONObject) JSON.toJSON(user2);
        System.out.println("(JSONObject) JSON.toJSON(user2)==>"+jsonObject.getString("name"));


        System.out.println("\n****** JSON对象 转 Java对象 ******");
        User to_java_user = JSON.toJavaObject(jsonObject, User.class);
        System.out.println("JSON.toJavaObject(jsonObject1, User.class)==>"+to_java_user);


    }

















}
