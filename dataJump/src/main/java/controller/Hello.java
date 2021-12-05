package controller;

import pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Hello {

    @RequestMapping("/hello")
    public String hello(@RequestParam("username") String name){
        System.out.println(name);
        return "hello";
    }


    @RequestMapping("/user")
    public String  User(User user){
        System.out.println(user);
        return "hello";
    }

    /**
     * 第二种 : 通过ModelMap
     * @param name
     * @param model
     * @return
     */
     @RequestMapping("/helloTest")
    public String hello03(@RequestParam("username") String name, ModelMap model){
        //封装要显示到视图中的数据
        //相当于req.setAttribute("name",name);
        model.addAttribute("name",name);
        System.out.println(name);
        return "hello";
    }


    @RequestMapping("/hello03")
    public String hello03(@RequestParam("name") String name,Model model){
        //封装要显示到视图中的数据
        //相当于req.setAttribute("name",name);
        model.addAttribute("msg",name);
        System.out.println(name);
        return "test01";
    }









}
