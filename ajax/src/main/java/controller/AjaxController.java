package controller;

import entity.UserAjax;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@RestController
public class AjaxController {

    @RequestMapping("/a1")
    public void ajax1(String name, HttpServletResponse response) throws Exception{

        if ("admin".equals(name)) {
            response.getWriter().print("true");
        }else {
            response.getWriter().print("false");
        }
    }


    @RequestMapping("/a2")
    public List<UserAjax> ajax2(){
        ArrayList<UserAjax> list = new ArrayList<UserAjax>();
        list.add(new UserAjax("大学生",10,"男"));
        list.add(new UserAjax("大螺蛳",10,"未知"));
        list.add(new UserAjax("大归属",10,"男"));
        list.add(new UserAjax("大故事",10,"男"));
        list.add(new UserAjax("大安然",10,"女"));
        return  list; //由于@RestController注解，将list转成json格式返回
    }

    @RequestMapping("/a3")
    public String ajax3(String name,String pwd){
        String msg="";
        //模拟数据库中存在数据
        if (name!=null) {
            if ("admin".equals(name)) {
                msg="OK";
            }else {
                msg="用户输入错误";
            }
        }
        if (pwd!=null) {
            if ("12345".equals(pwd)) {
                msg="OK";
            }else {
                msg="密码输入有误";
            }
        }
        return msg; //由于@RestController注解，将msg转成json格式返回
    }
}
