package controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pojo.User;
import util.JsonUtils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.SimpleTimeZone;


@RestController
public class UserController {

    //produces:指定响应体返回类型和编码
    @RequestMapping(value = "/json1",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String json1()throws JsonProcessingException{
        //创建一个jackson的对象映射器，用来解析数据
        ObjectMapper mapper = new ObjectMapper();
        //创建一个对象
        User user = new User("小名",34,"女");
        //将我们的对象解析成为json格式
        String str = mapper.writeValueAsString(user);
        //由于@ResponseBody注解，这里会将str转成json格式返回；十分方便
        return str;
    }

    @RequestMapping("/json2")
    public String json2()throws JsonProcessingException{
        //创建一个jackson的对象映射器，用来解析数据
        ObjectMapper mapper = new ObjectMapper();
        //创建一个对象
        User user = new User("小昆山",3,"女");
        User user2 = new User("小类",4,"男");
        User user3 = new User("告诉",6,"女");
        User user4 = new User("说了句法",6,"女");
        ArrayList<User> objects = new ArrayList<User>();
        objects.add(user);
        objects.add(user2);
        objects.add(user3);
        objects.add(user4);
        //将我们的对象解析成为json格式
        String s = mapper.writeValueAsString(objects);
        return s;
    }

    @RequestMapping("/json3")
    public String json3()throws JsonProcessingException{

        ObjectMapper mapper = new ObjectMapper();

        //创建时间一个对象，java.util.Date
        Date date = new Date();
        //将我们的对象解析成为json格式
        String s = mapper.writeValueAsString(date);
        return s;
    }


    @RequestMapping("/json4")
    public String json4() throws JsonProcessingException{

        ObjectMapper mapper = new ObjectMapper();
        //不使用时间戳的方式
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS,false);
        //自定义日期格式对象
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //指定日期格式
        mapper.setDateFormat(simpleDateFormat);

        Date date = new Date();
        String s = mapper.writeValueAsString(date);
        return s;
    }


    @RequestMapping("/json5")
    public String json5()throws JsonProcessingException{
        Date date = new Date();
        String json = JsonUtils.getJson(date);
        return json;
    }











}
